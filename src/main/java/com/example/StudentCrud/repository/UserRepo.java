package com.example.StudentCrud.repository;

import com.example.StudentCrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, String>{
}
