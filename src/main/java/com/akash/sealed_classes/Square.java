package com.akash.sealed_classes;

public final class Square extends Rectangle{
    public Square(){
       super();
       this.type = "Square";
    }

    public Square(String name){
       super(name);
        this.type = "Square";
    }
}
