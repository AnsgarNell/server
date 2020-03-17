package com.medium.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/greet")
    String greet(String name){
        return "Hello, " + name + "!";
    }
}