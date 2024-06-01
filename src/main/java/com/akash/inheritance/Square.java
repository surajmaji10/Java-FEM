package com.akash.inheritance;

public class Square extends Ractangle{
    private int side;
    public int calculateArea(){
        return side*side;
    }
    public int calculatePerimeter(){
        return 4 * side;
    }

    public Square(int side){
        this.side = side;
    }
}
