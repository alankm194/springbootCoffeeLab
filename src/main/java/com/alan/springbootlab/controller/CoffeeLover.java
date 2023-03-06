package com.alan.springbootlab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeLover {
    @GetMapping(value = "/coffeelover")
    public String loveCoffee(){
        return "I like coffee!";
    }
}
