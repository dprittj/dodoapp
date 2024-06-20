package com.dodo.dodoapp.controllers;

import com.dodo.dodoapp.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //  href (button, hyperlink) resource return
        // login page/form
    @GetMapping("/login")
    public String renderLogin(){
        return "users/login";
    }


    // user page (requires login or user creation)
    @GetMapping("/user")
    public String renderUserPage(){
        return "/users/user";
    }


    //  form resource return
        // from existing-user login to user page
    @PostMapping("/user")
    public String userLogin(@RequestParam String username, String password) {
        return "/users/user";
    }

    // from new-user button to create-user page
    @PostMapping("/new")
    public String renderCreateNewUser(@RequestParam String username, String password){
        return "/users/new";
    }

    // from create-user page to user page
    @PostMapping("/create")
    public String renderCreate(@RequestParam String firstname, String lastname, String location, String email){
        return "/users/user";
    }




}
