package com.example.nihaal.tracker;

public class CreateUser {

    public CreateUser(){

    }

    public CreateUser(String name, String email, String password, String code, String isSharing, String lat, String lng, String imageUrl, String userid) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.code = code;
        this.isSharing = isSharing;
        this.lat = lat;
        this.lng = lng;
        this.imageUrl = imageUrl;
        this.userid  = userid;
    }

    public String name, email, password, isSharing, code, lat, lng, imageUrl, userid;

}
