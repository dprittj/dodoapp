package com.dodo.dodoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String homepage(){
        return "index";
    }

//    @GetMapping("/error")
//        public String error(){
//            return "error";
//    }


}