package com.rizvi.spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","index", "index.html"})
    public String index(){
        System.out.println("some message for spring....1234");
        return "index";
    }
}
