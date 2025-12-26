package com.example.demo.service;
import com.example.demo.entity.user;
public interface userService{
    user getById(Long id);
    user create()
}