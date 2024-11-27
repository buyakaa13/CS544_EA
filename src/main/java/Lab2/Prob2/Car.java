package Lab2.Prob2;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String propertyModel;
    private String propertyMake;
    private int year;
    private int mileage;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Driver driver;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Owner owner;

    public Car(String propertyModel, String propertyMake, int year, int mileage) {
        this.propertyModel = propertyModel;
        this.propertyMake = propertyMake;
        this.year = year;
        this.mileage = mileage;
    }
    protected Car() {}

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Model: " + propertyModel + "\n"
                + "Make: " + propertyMake + "\n"
                + "Year: " + year + "\n"
                + "MileAge: " + mileage + "\n"
                + "Owner: " + owner + "\n"
                + "Driver: " + driver
                + "--------------------------";
    }
}
