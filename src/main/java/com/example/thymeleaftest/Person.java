package com.example.thymeleaftest;

import org.springframework.scheduling.support.SimpleTriggerContext;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }



}
