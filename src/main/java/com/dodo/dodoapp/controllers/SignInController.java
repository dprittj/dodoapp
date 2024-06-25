package com.dodo.dodoapp.controllers;

import com.dodo.dodoapp.data.UserRepository;
import com.dodo.dodoapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("signIn")
public class SignInController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String renderLogin(){
        return "signIn/login";
    }

    @GetMapping("/new")
    public String renderNewUser(){
        return "signIn/new";
    }

    @PostMapping("/new")
    public String createNewUser(@RequestParam String username, String password, String email, String name, String location){
        User thisUser = new User(username);
        thisUser.setPassword(password);
        thisUser.setName(name);
        thisUser.setEmail(email);
        thisUser.setLocation(location);
        userRepository.save(thisUser);

        return "/users/user";
    }

}
