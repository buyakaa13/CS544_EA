package Lab2.Prob1;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id @GeneratedValue
    private int id;
    private String name;
    private int gpa;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Course> courses = new ArrayList<>();
    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {

    }

    public void setCourse(Course course) {
        if(this.courses == null)
            this.courses = new ArrayList<>();
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", courses=" + courses +
                '}' + "\n";
    }
}
