package com.akash.sealed_classes;

public sealed class Shape permits Rectangle, Circle{
    public String name;
    public int sides;
    public String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color;

    public Shape(){
        this.sides = -1;
        this.type = "Not Known";
    }
    public Shape(String name){
        this.name = name;
        this.sides = -1;
        this.type = "Not Known";
    }

    protected void getDetails(){
        System.out.println("I am a " + this.color + " colored " + this.type + " of " + this.sides + " sides," + " and having name '" + this.name + "'");
    }
}
