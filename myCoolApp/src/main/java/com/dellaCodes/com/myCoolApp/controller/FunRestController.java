package com.dellaCodes.com.myCoolApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    injecting properties

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

//    endpoint to sue the coach, and team info
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "coach " + coachName + " ,team name" + teamName;
    }

//exposed "/" that turn "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

//    exposing an endpoint "/workout"
    @GetMapping("/workout")
    public String workout(){
        return "daily workout";
    }
}
