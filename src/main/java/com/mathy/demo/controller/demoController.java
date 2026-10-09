package com.mathy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @GetMapping("/hello")
    String sayHello(){
        return "Hello World!";
    }
}
