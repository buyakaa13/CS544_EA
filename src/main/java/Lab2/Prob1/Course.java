package Lab2.Prob1;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    private String title;
    private int capacity;
    @Embedded
    private Room room;
    @Column(name = "CODE", nullable = false)
    private int number;

    public void setRoom(Room room) {
        this.room = room;
    }

    public Course(String title, int capacity, int number) {
        this.title = title;
        this.capacity = capacity;
        this.number = number;
    }

    public Course() {

    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", capacity=" + capacity +
                ", room=" + room +
                ", number=" + number +
                '}' + "\n";
    }
}
