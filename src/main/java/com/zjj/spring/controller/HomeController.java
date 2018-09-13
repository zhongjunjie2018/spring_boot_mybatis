package com.zjj.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){

        System.out.println("home controller");

        return "index";
    }
    @RequestMapping("/index")
    public String getIndex(){

        System.out.println("index controller");

        return "index";
    }
}
