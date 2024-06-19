package com.akash.abstraction;

public abstract class Square extends Shape{
    protected int side;

    public Square(int side){
        this.color = "Black";
        this.side = side;
    }

    public Square(){
        this.color = "Black";
        this.side = 0; // not necessary
    }

    protected abstract void findDiag();

    @Override
    public void displayInfo(){
        System.out.println("I am a Square of color " + this.color);
    }
}
