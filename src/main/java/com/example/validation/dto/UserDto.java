package com.example.validation.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserDto {

    private int userId;
    @NotNull(message="Name est obligatoire")
    private String name;
    @Email(message="met email valide svp")
    private String email;
    private String mobile;
    @Min(18)
    @Max(50)
    private String gender;
    private int age;
    private String nationality;

    public UserDto() {
    }

    public UserDto(int userId, String name, String email, String mobile, String gender, int age, String nationality) {
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
