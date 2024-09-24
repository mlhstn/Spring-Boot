package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "hello dünya";
    }

    @GetMapping("workout")
    public String getDailyWorkout(){
        return "run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky day.";
    }


}
