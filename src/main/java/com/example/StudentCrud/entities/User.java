package com.example.StudentCrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(name = "user_id")
    private  String userId;
    @Column(name = "user_pass")
    private  String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public User() {
    }
}
