package Lab1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
     private String name;
     private String username;
     private String password;

     public User(String name, String username, String password) {
         this.name = name;
         this.username = username;
         this.password = password;
     }

    protected User() {}

    public int getId() {
        return id;
    }

    public String getName() {
         return name;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {return password;}

    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {
        return "Username: " + username + "\n"
                + "Name: " + name + "\n"
                + "Pass: " + password + "\n"
                + "--------------------------";
    }
}
