package Lab2.Prob1;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id @GeneratedValue
    private int id;
    private String name;
    private int gpa;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    protected Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                ", gpa=" + gpa +
                ", course=" + course.getTitle() +
                '}' + "\n";
    }
}
