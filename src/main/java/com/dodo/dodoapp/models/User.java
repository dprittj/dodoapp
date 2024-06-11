package com.dodo.dodoapp.models;

import java.util.ArrayList;
import java.util.List;

//import static com.dodo.dodoapp.controllers.routes.LoginController.users;

public class User {

    private static String username;

    private static String password;

    private static String email;

    private static String name;

    private static String location;

    private static Integer userId;

    public User(String username, String password, String email, String name, String location) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.location = location;
    }

    public User(){
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public Integer getUserId(){
        return userId;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static void setLocation(String location) {
        User.location = location;
    }

//    @Override
//    public String toString(Integer userId){
//        return
//    }


}
