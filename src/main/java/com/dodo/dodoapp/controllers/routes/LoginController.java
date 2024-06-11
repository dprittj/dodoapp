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

    private static ArrayList<User> users = new ArrayList<>();

    @GetMapping("login")
    public String login(){
        return "/dodo/login";
    }

    @PostMapping("user")
    public String userLogin(@RequestParam User username, User password){
        users.add(username);
        System.out.println(users.get(0));
        return "/dodo/user";
    }

    @GetMapping("user")
    public String welcomeUser(Model model){
        model.addAttribute("users", users);
        String welcomeMsg = "Welcome " + users.get(0);
        return "/dodo/user";
    }

    @PostMapping("user/new")
    public String newUser(@RequestParam String newUser, String password){
//        newUser = new User();
        return "/dodo/user/new";
    }



}
