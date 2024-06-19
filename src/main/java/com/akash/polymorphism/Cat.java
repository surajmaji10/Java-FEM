package com.akash.polymorphism;

public class Cat extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(){
        super();
        this.legs = 4;
    }
    public Cat(String color){
        this();
        setColor(color);
    }

    @Override
    public void makeSound(){
        System.out.println("Meoww...Meoww...");
    }
    public void getDetails(){
        System.out.print("I am Cat. ");
        if(this.color != null) System.out.print("My color is " + this.getColor() + ". ");
        System.out.println("I have " + this.legs + " legs. ");
    }
}
