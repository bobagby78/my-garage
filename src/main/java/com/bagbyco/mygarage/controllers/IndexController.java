package com.bagbyco.mygarage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping
    public String renderHomeView(){
        return "index.html";
    }

    @RequestMapping("/user-login")
    public String loginPage(){
        return "user-login";
    }
    @RequestMapping("/logout")
    public String logoutPage(){
        return "logout.html";
    }

}
