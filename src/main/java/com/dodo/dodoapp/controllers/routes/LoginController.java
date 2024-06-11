package com.dodo.dodoapp.controllers.routes;

import com.dodo.dodoapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

//import static com.dodo.dodoapp.models.User.userlist;

@Controller
@RequestMapping("dodo")
public class LoginController {

    private static ArrayList<String> users = new ArrayList<>();

//  render login page
    @GetMapping("login")
    public String login(){
        return "/dodo/login";
    }

//  accept login form
    @PostMapping("/users/user")
    public String userLogin(@RequestParam String username, String password){
        users.add(username);
        System.out.println(users.get(0));
        return "/dodo/users/user";
    }
//  render user page after login
    @GetMapping("/users/user")
    public String welcomeUser(Model model){
        model.addAttribute("users", users);
        String welcomeMsg = "Welcome " + users.get(0);
        return "/dodo/users/user";
    }

//  render new user page
    @PostMapping("users/new")
    public String newUser(@RequestParam String newUser, String password){
//        newUser = new User();
        return "/dodo/users/new";
    }



}
