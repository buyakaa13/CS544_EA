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

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Person driver;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Person owner;

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getPropertyModel() {
        return propertyModel;
    }

    public Car(String propertyModel, String propertyMake, int year, int mileage) {
        this.propertyModel = propertyModel;
        this.propertyMake = propertyMake;
        this.year = year;
        this.mileage = mileage;
    }

    protected Car() {}

    @Override
    public String toString() {
        return "Model: " + propertyModel + "\n"
                + "Make: " + propertyMake + "\n"
                + "Year: " + year + "\n"
                + "MileAge: " + mileage + "\n"
                + "Owner: " + owner + "\n"
                + "Driver: " + driver + "\n"
                + "--------------------------";
    }
}
