package com.alan.springbootlab.model;

public class Coffee {


    private String name;
    private long id;

    public Coffee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
