package com.example.demo.service;
import com.example.demo.entity.User;
public interface UserService{
    user getById(Long id);
    User create(User data);
}