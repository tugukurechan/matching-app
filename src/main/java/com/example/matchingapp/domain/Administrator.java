package com.example.matchingapp.domain;

import java.time.LocalDate;
import java.util.Date;

/**
 * 管理者情報のドメインクラス
 *
 * @author tugukurechan
 */
public class Administrator {
    /** id */
    private Integer id;
    /** 名前 */
    private String name;
    /** メアド */
    private String mailAddress;
    /** パスワード */
    private String password;
    /** 誕生日 */
    private LocalDate birthDay;
    /** 性別 */
    private String gender;

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", name='" + name + '\'' +
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
