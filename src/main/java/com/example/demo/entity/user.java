package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
class user{
    private String Name;
    @unique()
    private String email;
}