package com.akash.inheritence_multilevel;

public class Audi extends Car{
    public Audi(String color){
        this();
        setColor(color);
    }

    public Audi(){
        setDoors(4);
        this.name = "Audi";
        this.color = "White";
    }

    public void getDetails(){
        System.out.println("I have an " + this.name + " of " + this.getColor() + " color, and having " + this.getDoors() + " doors.");
    }
}
