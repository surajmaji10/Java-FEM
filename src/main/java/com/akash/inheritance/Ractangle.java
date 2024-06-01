package com.akash.inheritance;

public class Ractangle {
    private int length;
    private int breadth;

   public Ractangle(){

   }

    public Ractangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int calculateArea(){
        return length * breadth;
    }

    public int calculatePerimeter(){
        return (length + breadth) * 2;
    }
}
