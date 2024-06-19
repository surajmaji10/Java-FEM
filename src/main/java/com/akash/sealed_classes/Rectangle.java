package com.akash.sealed_classes;

public sealed class Rectangle extends Shape permits Square{
    public Rectangle(){
        this.sides = 4;
        this.type = "Rectangle";
    }

    public Rectangle(String name){
        this.sides = 4;
        this.name = name;
        this.type = "Rectangle";
    }
}
