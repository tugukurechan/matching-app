package com.example.matchingapp.domain;

/**
 * 管理者情報のドメインクラス
 *
 * @author tugukurechan
 */
public class Administrators {
    /** id */
    private Integer id;
    /** 名前 */
    private String name;
    /** メアド */
    private String mailAddress;
    /** パスワード */
    private String password;

    @Override
    public String toString() {
        return "Administrators{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

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
}
