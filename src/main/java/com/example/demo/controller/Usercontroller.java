package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.service.Userservice;
import org.springframework.web.bind.annotation.*;
import org.srpingframework.beans.factory.annotation.Autowired;
@RequestMapping("/user")
public class Usercontroller{
    @Autowired
    Userservice.obj;
    @PostMapping("/register")
    User Createuser(@RequestBody User data){
        return obj.create(User data)
    }
    @GetMapping("/getuser")
    public FindUserByIUdgetById(Long id)
}