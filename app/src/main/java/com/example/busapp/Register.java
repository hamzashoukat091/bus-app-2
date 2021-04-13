package com.example.busapp;

public class Register {

    String fullname;
    String phone;
    String user;
    String password;
    String bus;

    public Register(String fullname, String phone, String user, String password, String bus) {
        this.fullname = fullname;
        this.phone = phone;
        this.user = user;
        this.password = password;
        this.bus = bus;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPhone() {
        return phone;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getBus() {
        return bus;
    }
}
