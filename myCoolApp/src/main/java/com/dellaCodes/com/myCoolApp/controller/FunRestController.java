package com.dellaCodes.com.myCoolApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//exposed "/" that turn "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}
