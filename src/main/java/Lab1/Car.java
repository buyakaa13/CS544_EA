package Lab1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String propertyModel;
    private String propertyMake;
    private int year;
    private int mileage;
    public Car(String propertyModel, String propertyMake, int year, int mileage) {
        this.propertyModel = propertyModel;
        this.propertyMake = propertyMake;
        this.year = year;
        this.mileage = mileage;
    }
    protected Car() {}

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Model: " + propertyModel + "\n"
                + "Make: " + propertyMake + "\n"
                + "Year: " + year + "\n"
                + "MileAge: " + mileage + "\n"
                + "--------------------------";
    }
}
