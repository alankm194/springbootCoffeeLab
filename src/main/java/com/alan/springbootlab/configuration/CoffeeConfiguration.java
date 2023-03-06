package com.alan.springbootlab.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CoffeeConfiguration {


    @Bean(name = "coffeeBeans")
    public Map<String, Long> myMap() {
        Map<String, Long> map = new HashMap<>();
        map.put("latte", 1L);
        map.put("expresso", 2L);
        map.put("monkey coffee", 3L);
        return map;
    }
}
