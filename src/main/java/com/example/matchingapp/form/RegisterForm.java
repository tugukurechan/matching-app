package com.example.matchingapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;


public class RegisterForm {
    @NotBlank(message = "名前は入力必須です")
    private String name;
    @NotBlank(message = "メールアドレスは入力必須です")
    private String mailAddress;
    @NotBlank(message = "パスワードは入力必須です")
    @Size(max = 16, min = 8, message = "パスワードは8文字以上16文字以下")
    private String password;
    @NotBlank(message = "誕生日は入力必須です")
    private Date birthday;

    private String gender;

    @Override
    public String toString() {
        return "RegisterForm{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
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
