package com.fynanse.Fynanse.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="USER")
public class User {
    private int id;
    @Id
<<<<<<< HEAD:src/main/java/com/fynanse/Fynanse/api/models/User.java
    @Column(nullable = false, unique = true)
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERNAME")
>>>>>>> 56fb085404c8c3f0f351e8ecb4847c6af60fa636:src/main/java/com/fynanse/Fynanse/api/User/User.java
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    private String userPassword;
    public String firstName;
    public String lastName;

    public User(){
        System.out.println("User object created");
    }
    public User(String username, String email, String password, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.userPassword = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String password) {
        this.userPassword = password;
    }
}