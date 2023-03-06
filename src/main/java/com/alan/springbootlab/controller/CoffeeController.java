package com.alan.springbootlab.controller;

import com.alan.springbootlab.model.Coffee;
import com.alan.springbootlab.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue =
            "latte") String name) {
        Coffee myCoffee= coffeeService.getCoffee(name);
        return myCoffee;
    }

    @GetMapping("/error")
    public String error() {
        return "404";
    }
}
