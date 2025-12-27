package com.example.demo.service.impl;
import com.example.demo.service.UserService;
import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
class Userserviceimpl implements UserService{
    @Autowired
    Userrepository obj;
    public User getById(Long id){
        return obj.findById(id).orElse(null);
    }
    public User create(User data){
        return obj.save(data);
    }
    public User updateUser(Long id,User data){
        User obj1=obj.findById(id)
        .orElseThrow(()-> new RuntimeException("No user is found"));
        obj1.setEmail(data.getEmail());
        obj1.setName(data.getName());
        return obj.save(obj1);
    }
}