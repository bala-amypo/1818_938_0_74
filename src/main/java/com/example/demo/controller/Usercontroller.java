package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.srpingframework.beans.factory.annotation.Autowired;
@RequestMapping("/user")
public class Usercontroller{
    @Autowired
    Userservice obj;
    @PostMapping("/register")
    User Createuser(@RequestBody User data){
        return obj.create(data);
    }
    @GetMapping("/getuser/{id}")
    public User FindUserById(@PathVariable Long id){
        return obj.getById(id);
        }
}