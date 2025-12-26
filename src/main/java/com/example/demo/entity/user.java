package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
@Entity
class user{
    private String name;
    @Column(unique=true)
    private String email;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email=email;
    }
    public user(){}
    public user(String name,String email){
        this.name=name;
        this.email=email;
    }
}