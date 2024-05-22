package com.example.matchingapp.domain;

import java.util.Date;
import java.util.List;

public class Person {
    private Integer id;
    private String name;
    private String image;
    private String gender;
    private Date birthDay;
    private String mailAddress;
    private String comment;
    private String bloodType;

    private List<Person> talkList;

    public Person(){
        //default
    }

    public Person(String name, String image, String gender, Date birthDay,String mailAddress, String comment, String bloodType, List<Person> talkList) {
        this.birthDay = birthDay;
        this.bloodType = bloodType;
        this.comment = comment;
        this.gender = gender;
        this.image = image;
        this.mailAddress = mailAddress;
        this.name = name;
        this.talkList = talkList;
    }

    @Override
    public String toString() {
        return "People{" +
                "birthDay=" + birthDay +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", gender='" + gender + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", comment='" + comment + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", talkList=" + talkList +
                '}';
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

    public List<Person> getTalkList() {
        return talkList;
    }

    public void setTalkList(List<Person> talkList) {
        this.talkList = talkList;
    }
}
