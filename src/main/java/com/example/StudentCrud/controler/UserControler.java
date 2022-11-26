package com.example.StudentCrud.controler;

import com.example.StudentCrud.entities.User;
import com.example.StudentCrud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserControler {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/signUp")
    public  String logIn(){
        return"signUp";
    }
    @PostMapping ("/signUpInformation")
    public String logInConformation(
            @ModelAttribute User user){
        userRepo.save(user);
        System.out.print(user.getUserId());
        System.out.print(user.getPassword());
        return "signUpConformation";
    }

}
