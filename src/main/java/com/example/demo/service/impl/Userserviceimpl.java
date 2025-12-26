package com.example.demo.service.impl;
import com.example.demo.service.Userservice;
import com.example.demo.entity.User;
import com.example.demo.repositorty.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
class Userserviceimpl implements Userservice{
@Autowired
    Userrepository obj.
    public User getById(Long id){
        return obj.findById(id).orElse(null);
    }
    User create(User data){
        return obj.save(data);
    }
}