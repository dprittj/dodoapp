package com.dodo.dodoapp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;

    @NotBlank(message = "Username required")
    @Size(min = 5, max = 12, message = "Username must be 5 - 12 characters")
    @Column(name = "username", nullable = false)
    private String username;

    @NotBlank(message = "Username required")
    @Size(min = 8, max = 16, message = "Password must be 8 - 16 characters")
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank(message = "Email address required")
    @Email(message = "Invalid email address")
    @Column(name = "email", nullable = false)
    private String email;

    @NotBlank(message = "Name required")
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "Location required")
    @Column(name = "location", nullable = false)
    private String location;

    public User(String username, String password, String email, String name, String location) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.location = location;
    }
    public User(){ }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
