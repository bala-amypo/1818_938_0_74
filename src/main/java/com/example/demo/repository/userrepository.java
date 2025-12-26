package com.example.demo.repository;
import com.exmaple.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
public interface userrepository extends JpaRepository<user,Long>{
    
}