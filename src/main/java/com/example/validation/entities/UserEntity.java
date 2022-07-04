package com.example.validation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my_users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

    public UserEntity() {
    }

    public UserEntity(String name, String email, String mobile, String gender, int age, String nationality) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public UserEntity(int userId, String name, String email, String mobile, String gender, int age,
            String nationality) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
