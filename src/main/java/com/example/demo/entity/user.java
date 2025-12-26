package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
class user{
    private String name;
    @Column(unique=true)
    private String email;
    String getName(){
        return name;
    }
    String setName(String name){
        this.name=name;
    }
    String getEmail(){
        return email;
    }
    String setEmail(String email){
        this.email=email;
    }
    public user(){}
    public user(String name,String email){
        this.name=name;
        this.email=email;
    }
}