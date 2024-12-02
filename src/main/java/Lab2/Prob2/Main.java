package Lab2.Prob2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program starting ...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab_Unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Person owner = new Person("Lucy", 23);
        Person driver = new Person("John", 35);
        Car car = new Car("Lexus-570", "metal", 2023, 100);
        car.setDriver(driver);
        car.setOwner(owner);
        owner.setOwnerCar(car);

        em.persist(owner);
        em.persist(driver);
        em.persist(car);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Car: \n" + car);
        System.out.println("Program finished ...");
    }
}




