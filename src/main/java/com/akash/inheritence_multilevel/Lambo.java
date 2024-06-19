package com.akash.inheritence_multilevel;

public class Lambo extends Car {
    public Lambo(){
        setDoors(2);
        this.name = "Lambo";
        this.color = "Black";
    }

    public void getDetails(){
        System.out.println("I have a " + this.name + " of " + this.getColor() + " color, and having " + this.getDoors() + " doors.");
    }
}
