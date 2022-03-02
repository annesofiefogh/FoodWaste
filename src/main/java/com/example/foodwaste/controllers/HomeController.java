package com.example.foodwaste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String frontPage(){
        return "Forside";
    }

    @GetMapping("/private")
    public String privatePerson(){
        return "PrivatePerson";
    }

    @GetMapping("/small")
    public String smallCompany(){
        return "SmallCompany";
    }

    @GetMapping("/large")
    public String largeCompany(){
        return "LargeCompany";
    }

}
