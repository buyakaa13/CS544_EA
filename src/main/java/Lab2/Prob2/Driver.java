package Lab2.Prob2;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class Driver extends Person{
    private int jobExperience;
    public Driver(String name, int age, int jobExperience) {
        super(name, age);
        this.jobExperience = jobExperience;
    }

    public Driver() {

    }

    @Override
    public String toString() {
        return super.toString() + " jobExperience: " + jobExperience + "\n";
    }
}
