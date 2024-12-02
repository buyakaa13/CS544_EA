package Lab2.Prob1;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SecondaryTable(name = "CourseRoom", pkJoinColumns = @PrimaryKeyJoinColumn(name = "course_id"))
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int capacity;
    @Column(table = "CourseRoom")
    private String room;
    @Column(name = "CODE", nullable = false)
    private int number;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Course(String title, int capacity, int number, String room) {
        this.title = title;
        this.capacity = capacity;
        this.number = number;
        this.room = room;
    }

    protected Course() {}

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", capacity=" + capacity +
                ", room=" + room +
                ", number=" + number +
                ", students=" + students +
                '}' + "\n";
    }
}
