package com.codewithishaan.blog.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name") 
    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Column(name = "contact_no", length = 20)
    private String contactNo;

    @Column(name = "car_model", length = 50)
    private String model;

    @Column(name = "car_color", length = 7)  
    private String color;

    @Column(name = "shininess") 
    private Double shininess;

    // Constructors
    public User() {}

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getShininess() {
        return shininess;
    }

    public void setShininess(Double shininess) {
        this.shininess = shininess;
    }
}
