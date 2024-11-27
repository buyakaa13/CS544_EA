package Lab2.Prob1;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Embeddable
public class Room {
    @Id @GeneratedValue
    private int id;
    private int roomNumber;
    private String roomName;

    public Room(int roomNumber, String roomName) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
    }

    public Room() {

    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", roomName='" + roomName + '\'' +
                '}' + "\n";
    }
}
