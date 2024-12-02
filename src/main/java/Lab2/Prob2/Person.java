package Lab2.Prob2;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @OneToOne(mappedBy = "owner", cascade = CascadeType.ALL)
    private Car ownerCar;

    public int getId() {
        return id;
    }

    public void setOwnerCar(Car ownerCar) {
        this.ownerCar = ownerCar;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name +
                ", age=" + age +
                ", ownerCar=" + (ownerCar != null ? ownerCar.getPropertyModel() : "None") +
                '}';
    }
}
