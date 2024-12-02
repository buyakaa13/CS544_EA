package Lab2.Prob1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("System starting ...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab_Unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student1 = new Student("Brain", 30);
        Student student2 = new Student("Anna", 23);

        Course course1 = new Course("Enterprise architecture", 23, 10, "29");
        Course course2 = new Course("Algorithm", 18, 11, "21");
        Course course3 = new Course("Java", 21, 12, "128");
        Course course4 = new Course("MPP", 26, 13, "23");

        student1.setCourse(course1);
        student2.setCourse(course2);

        course1.getStudents().add(student1);
        course1.getStudents().add(student2);
        course2.getStudents().add(student1);
        course2.getStudents().add(student2);

        em.persist(course1);
        em.persist(course2);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println(course1);
        System.out.println(course2);
        System.out.println("System ending ...");
    }
}
