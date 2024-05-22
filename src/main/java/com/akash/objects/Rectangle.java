package com.akash.objects;

public class Rectangle {
    private final int sides = 4;
    private double length;
    private double width;
    public String name;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(length);
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return (length + width) * 2;
    }

    public int getSides() {
        return sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString(){
        return this.name + "[" +
                "length=" + this.length +
                ", width=" + this.width +
                ", area=" + calculateArea() +
                ", peri=" + calculatePerimeter() +
                "]";
    }
}
