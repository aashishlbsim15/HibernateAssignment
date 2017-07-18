package com.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class User {
    public User(String fname, String lname, String password, String username, String email, byte[] photo) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.username = username;
        this.email = email;
        this.photo = photo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int id;
    private String fname;
    private String lname;
    private String password;
    private String username;
    private String email;
    private byte[] photo;

    public User() {
    }

    public User(String fname) {
        this.fname = fname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
