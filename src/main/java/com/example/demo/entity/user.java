package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persitence
@Entity
class user{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
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