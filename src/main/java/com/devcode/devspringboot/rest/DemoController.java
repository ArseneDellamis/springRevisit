package com.devcode.devspringboot.rest;

import com.devcode.devspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define field
    private Coach mycoach;

    @Autowired
    public void setCoach(Coach theCoach) {
        mycoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return mycoach.getDailyWorkout();
    }
}
