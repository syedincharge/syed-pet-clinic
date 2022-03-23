package com.rizvi.spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","index", "ownersList.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){

        return "notimplemented";
    }
}
