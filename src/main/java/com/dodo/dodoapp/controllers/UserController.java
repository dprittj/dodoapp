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
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    findAll, save, findById, delete, deleteAll, deleteById, existsById, count
//    https://youtu.be/0eug2HI7rbo?list=PLs5n5nYB22fIVO1nSiNoUTHIbQujdHYuC&t=658



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


    //  html form resource return
        // from existing-user login to user page
    @PostMapping("/user")
    public String userLogin(@RequestParam Model model, String username, String password){
        User thisUser = new User(username);
        thisUser.setPassword(password);
        model.addAttribute("username", username);
        model.addAttribute("userRepository", userRepository.save(thisUser));


        return "/users/user";
    }

    // from new-user button to create-user page
    @PostMapping("/new")
    public String renderCreateNewUser(@RequestParam String username, String password){
        User newUser = userRepository.save(new User(username));
        return "/users/new";
    }

    // from create-user page to user page
    @PostMapping("/create")
    public String renderCreate(@RequestParam Model model, String firstname, String lastname, String location, String email){
        model.addAttribute("users", userRepository);

        return "/users/user";
    }




}
