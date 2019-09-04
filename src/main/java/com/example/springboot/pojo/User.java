package com.example.springboot.pojo;

public class User {
    private int id;
    private String name;
    private String password;
    private int phone;
    private int classId;

    public User() {
    }

    public User(int id, String name, String password, int phone, int classId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.classId = classId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
