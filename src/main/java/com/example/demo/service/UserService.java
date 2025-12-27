package com.example.demo.service;
import com.example.demo.entity.User;
public interface UserService{
    User getById(Long id);
    User create(User data);
    User updateUser(Long id,User data);
    User updateone(Long id,User data);
    void deleteUser(Long id);
}