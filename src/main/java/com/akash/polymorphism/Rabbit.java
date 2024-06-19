package com.akash.polymorphism;

public class Rabbit extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rabbit(){
        super();
        this.legs = 2;
    }

    public Rabbit(String color){
        this();
        setColor(color);
    }

    public void getDetails(){
        System.out.print("I am Rabbit. ");
        if(this.color != null) System.out.print("My color is " + this.getColor() + ". ");
        System.out.println("I have " + this.legs + " legs. ");
    }

    public void doSomething(){
        System.out.println("I am doing nothing");
    }
}
