package com.medium.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/")
    String greet(){
        return "Hello, World!";
    }
}