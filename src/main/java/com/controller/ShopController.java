package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class ShopController {


    @RequestMapping("login")
    public String login(String username, String password){
        System.out.println(username);
        return "123123";
    }
}
