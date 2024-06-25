package com.dodo.dodoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("signIn")
public class SignInController {

    @GetMapping("/login")
    public String renderLogin(){
        return "signIn/login";
    }

    @GetMapping("/new")
    public String renderNewUser(){
        return "signIn/new";
    }

}
