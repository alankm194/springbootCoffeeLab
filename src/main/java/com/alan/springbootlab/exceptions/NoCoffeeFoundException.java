package com.alan.springbootlab.exceptions;


public class NoCoffeeFoundException extends RuntimeException{

    public NoCoffeeFoundException(String coffee){
        super("No Coffee of of this type exists " + coffee);
    }

}
