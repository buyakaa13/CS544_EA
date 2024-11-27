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
        Student student = new Student("Brain", 3);
        Room room1 = new Room(10, "Verill hall");
        Room room2 = new Room(11, "Mc Laugh");
        Room room3 = new Room(12, "Dalby hall");
        Room room4 = new Room(13, "Mc Laugh");
        Course course1 = new Course("Enterprise architecture", 23, 10);
        course1.setRoom(room1);
        Course course2 = new Course("Algorithm", 18, 11);
        course2.setRoom(room2);
        Course course3 = new Course("Java", 21, 12);
        course3.setRoom(room3);
        Course course4 = new Course("MPP", 26, 13);
        course4.setRoom(room4);
        student.setCourse(course1);
        student.setCourse(course2);
        student.setCourse(course3);
        student.setCourse(course4);
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println(student);
        System.out.println("System ending ...");
    }
}
