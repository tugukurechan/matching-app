package com.example.matchingapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Date;


public class RegisterForm {
    @NotBlank(message = "名前は入力必須です")
    private String name;
    @NotBlank(message = "メールアドレスは入力必須です")
    private String mailAddress;
    @NotBlank(message = "パスワードは入力必須です")
    @Size(max = 16, min = 8, message = "パスワードは8文字以上16文字以下")
    private String password;
    @NotNull(message = "誕生日は入力必須です")
    private LocalDate birthDay;

    private String gender;

    @Override
    public String toString() {
        return "RegisterForm{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", password='" + password + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
