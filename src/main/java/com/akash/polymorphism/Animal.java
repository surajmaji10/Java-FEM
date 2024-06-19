package com.akash.polymorphism;

public class Animal {
    protected String name;
    protected int legs;

    public Animal(){
        this.name = "I don't know yet";
        this.legs = 0;
    }
    public void makeSound(){
        System.out.println("I don't know what to say.");
    }
}
