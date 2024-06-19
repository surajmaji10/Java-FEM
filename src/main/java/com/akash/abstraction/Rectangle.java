package com.akash.abstraction;

public class Rectangle extends Shape{
    private int length;
    private int breadth;

    @Override
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    @Override
    protected void getPeri() {
        int peri = 2 * (length + breadth);
        System.out.println("Perimeter: " + peri);
    }

    public Rectangle(){
        this.color = "White";
    }

    public Rectangle(int len, int wid){
        this();
        length = len;
        breadth = wid;
    }

    @Override
    public void displayInfo(){
        System.out.println("I am a Rectangle shape of color " + this.color);
    }
}
