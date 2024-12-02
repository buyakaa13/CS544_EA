package Lab1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lab_Unit");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        User user1 = new User("firstUser", "user1", "123");
        System.out.println("User1: " + user1);
        User user2 = new User("secondUser", "user2", "456");
        System.out.println("User2: " + user2);
        em.persist(user1);
        em.persist(user2);

        Car car1 = new Car("Prius50", "metal", 2018, 2000);
        System.out.println("Car1: " + car1);
        Car car2 = new Car("Lexus570", "metal", 2023, 150);
        System.out.println("Car2: " + car2);
        em.persist(car1);
        em.persist(car2);

        User findUser = em.find(User.class, user1.getId());
        System.out.println("findUser: " + findUser);
        findUser.setUsername("setFirstUser");
        em.merge(findUser);

        Car findCar = em.find(Car.class, car1.getId());
        System.out.println("Remove car: " + findCar);
        em.remove(findCar);
        transaction.commit();
        em.close();
        factory.close();

    }
}
