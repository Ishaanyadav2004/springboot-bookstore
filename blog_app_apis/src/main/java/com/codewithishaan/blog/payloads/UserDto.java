package com.codewithishaan.blog.payloads;

public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String password;

    private String contactNo;
    private String model;
    private String color;
    private Double shininess;


    public UserDto() {}

   
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
