package com.example.airlinereservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String Home(){
        return "home";
    }

    @RequestMapping(value = "/contact")
    public String Contact(){
        return "contact";
    }

    @RequestMapping("/login")
    public String Login(){
        return "login";
    }
    @RequestMapping("/signup")
    public String Signup(){
        return "signup";
    }

//
//    @RequestMapping("/about")
//    public String About(){
//        return "about";
//    }
//
//    @RequestMapping("/concert")
//    public String Concert(){
//        return "concerts";
//    }
//    @RequestMapping("/contact")
//    public String Contact(){
//        return "contact";
//    }
//
//    @RequestMapping("/gallery")
//    public String Gallery(){
//        return "gallery";
//    }


}