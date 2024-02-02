package com.microservice.serviceOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class FirstController {

    @GetMapping("/greet")
    public String sayHello(){
        return "hello from service-one";
    }
}
