package Lab2.Prob2;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Owner extends Person {
    public Owner(String name, int age) {
        super(name, age);
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    private Car car;

    public Owner() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
