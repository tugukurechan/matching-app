package com.example.matchingapp.domain;

import java.util.Date;

/**
 * 管理者情報のドメインクラス
 *
 * @author tugukurechan
 */
public class Administrator {
    /** id */
    private Integer id;
    /** メアド */
    private String mailAddress;
    /** パスワード */
    private String password;
    /** 誕生日 */
    private Date birthDay;
    /** 性別 */
    private String gender;

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", mailAddress='" + mailAddress + '\'' +
                ", password='" + password + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                '}';
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
