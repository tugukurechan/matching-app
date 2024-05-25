package com.example.matchingapp.form;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;


public class RegisterForm {
    @NotBlank(message = "メールアドレスが空です")
    private String email;

    @NotBlank(message = "パスワードは入力必須です")
    private String password;
    private Date birthday;
    private String gender;

    @Override
    public String toString() {
        return "RegisterForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                '}';
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
