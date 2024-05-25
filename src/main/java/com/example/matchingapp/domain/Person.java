package com.example.matchingapp.domain;

import java.util.Date;
import java.util.List;

/**
 * アプリを利用する人の情報
 * @author tugukurechan
 */
public class Person {
    private Integer id;/** not null */
    private String name;/** not null */
    private String image;
    private String gender;/** not null */
    private Date birthDay;/** not null */
    private String mailAddress;/** not null */
    private String password;/** not null */
    private String comment;
    private String bloodType;

    private List<Person> matchList;

    public Person(){
        //default
    }

    public Person(String name, String image, String gender, Date birthDay,String mailAddress, String comment, String bloodType, List<Person> matchList) {
        this.birthDay = birthDay;
        this.bloodType = bloodType;
        this.comment = comment;
        this.gender = gender;
        this.image = image;
        this.mailAddress = mailAddress;
        this.name = name;
        this.matchList = matchList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", mailAddress='" + mailAddress + '\'' +
                ", password='" + password + '\'' +
                ", comment='" + comment + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", matchList=" + matchList +
                '}';
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

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Person> matchList) {
        this.matchList = matchList;
    }
}
