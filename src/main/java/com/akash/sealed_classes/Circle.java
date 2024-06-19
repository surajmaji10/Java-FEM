package com.akash.sealed_classes;

public non-sealed class Circle extends Shape{
    public Circle(){
        this.sides = 0;
        this.type = "Circle";
    }

    public Circle(String name){
        this.sides = 0;
        this.name = name;
        this.type = "Circle";
    }
}
