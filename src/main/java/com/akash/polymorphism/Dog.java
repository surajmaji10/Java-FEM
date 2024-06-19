package com.akash.polymorphism;

public class Dog extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(){
        super();
        this.legs = 4;
    }
    public Dog(String color){
        this();
        setColor(color);
    }

    @Override
    public void makeSound(){
        System.out.println("Boww...Boww...");
    }
    public void getDetails(){
        System.out.print("I am Dog. ");
        if(this.color != null) System.out.print("My color is " + this.getColor() + ". ");
        System.out.println("I have " + this.legs + " legs. ");
    }

    public void play(){
        System.out.println("I am playing");
    }

}
