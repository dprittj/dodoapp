package com.dodo.dodoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dodo")
public class DodoRoutingController {

    //  href (button, hyperlink) resource return

        // login page/form
    @GetMapping("login")
    public String renderLogin(){
        return "/dodo/login";
    }

        // user page (requires login or user creation)
    @GetMapping("/users/user")
    public String renderUserPage(){
        return "/dodo/users/user";
    }


    //  form resource return

        // from existing-user login to user page
    @PostMapping("/users/user")
    public String userLogin(@RequestParam String username, String password) {
        return "/dodo/users/user";
    }

        // from new-user button to create-user page
    @PostMapping("users/new")
    public String renderCreateNewUser(@RequestParam String username, String password){
        return "/dodo/users/new";
    }

        // from create-user page to user page
    @PostMapping("users/create")
    public String renderCreate(@RequestParam String firstname, String lastname, String location, String email){
        return "/dodo/users/user";
    }



}
