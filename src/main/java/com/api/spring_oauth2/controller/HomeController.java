package com.api.spring_oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String greet(){
        return "Successfully, Logged in Through GitHub!! :)";
    }
}
