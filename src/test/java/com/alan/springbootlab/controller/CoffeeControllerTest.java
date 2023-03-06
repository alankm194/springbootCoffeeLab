package com.alan.springbootlab.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CoffeeControllerTest {

    @Autowired
    private MockMvc mockController;

    @Test
    public void testCoffeeControllerNoParam() throws Exception {
        var expected = "{\"name\":\"latte\",\"id\":1}";
        this.mockController
                .perform(MockMvcRequestBuilders.get("/coffee"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expected));
    }


    @Test
    public void testCoffeeControllerWithCappuccinoParam() throws Exception {
        var expected = "{\"name\":\"expresso\",\"id\":2}";
        this.mockController
                .perform(MockMvcRequestBuilders.get("/coffee?name=expresso"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expected));
    }

    @Test
    public void testCoffeeControllerWithNoFoundCoffee() throws Exception {
        var expected = "{\"message\":\"No Coffee of this type\",\"status\":\"404\"}";
        this.mockController
                .perform(MockMvcRequestBuilders.get("/coffee?name=notfound"))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
                .andExpect(MockMvcResultMatchers.content().string(expected));
    }
}
