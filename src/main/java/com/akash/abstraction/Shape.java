package com.akash.abstraction;

public abstract class Shape {
    public String color;

    public abstract void getArea();
    protected abstract void getPeri();

    public void displayInfo(){
        System.out.println("I am a Shape");
    }
}
