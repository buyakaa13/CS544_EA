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
        Car car = new Car("Lexus-570", "metal", 2023, 100);
        Owner owner = new Owner("Lucy", 23);
        owner.setCar(car);
        Driver driver = new Driver("John", 35, 12);
        car.setOwner(owner);
        car.setDriver(driver);
        em.persist(car);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println(car);
        System.out.println("Owner car info: \n" + owner.getCar());
        System.out.println("Program finished ...");
    }
}
