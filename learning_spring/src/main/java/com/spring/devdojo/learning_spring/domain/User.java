package com.spring.devdojo.learning_spring.domain;

public class User {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }

    public User(){

    }
    
}
