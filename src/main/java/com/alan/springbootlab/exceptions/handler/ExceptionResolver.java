package com.alan.springbootlab.exceptions.handler;

import com.alan.springbootlab.exceptions.NoCoffeeFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;

@RestControllerAdvice
public class ExceptionResolver {

    @ExceptionHandler(NoCoffeeFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HashMap<String, String> handleNoHandlerFound(NoCoffeeFoundException e, WebRequest request) {
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "404");
        response.put("message", e.getLocalizedMessage());
        return response;
    }
}
