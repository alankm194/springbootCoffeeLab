package com.alan.springbootlab.service;

import com.alan.springbootlab.exceptions.NoCoffeeFoundException;
import com.alan.springbootlab.model.Coffee;
import com.alan.springbootlab.repository.CoffeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepo coffeeRepo;


    public Coffee getCoffee(String coffeeName) {
        Long id = coffeeRepo.getCoffeeId(coffeeName);
        if (id == null) {
            throw new NoCoffeeFoundException(coffeeName);
        }
        return new Coffee(id, coffeeName);
    }

}
