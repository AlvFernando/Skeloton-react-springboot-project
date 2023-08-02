package com.application.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testconnection")
    public String index(){
        return "server is up!";
    }
}
