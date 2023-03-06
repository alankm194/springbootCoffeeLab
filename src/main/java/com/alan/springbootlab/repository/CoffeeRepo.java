package com.alan.springbootlab.repository;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CoffeeRepo {

    @Resource(name ="coffeeBeans")
    public Map<String, Long> map;

    public Long getCoffeeId(String coffeeName) {
        return map.get(coffeeName);
    }


}
