package com.akash.abstraction;

public class Driver {
    public static void main(String[] args) {
        //Shape shape = new Shape(); /*invalid*/
        Shape shape = new Rectangle(9, 7);
        shape.getArea();
        shape.getPeri();
        shape.displayInfo();

        //Shape shape = new Square(10); /*invalid*/

        Shape shapeNew = new SquareExtended(10);
        shapeNew.getArea();
        shapeNew.getPeri();
        //shapeNew.shapeNew(); /* shapeNew() is in Square, not Shape*/
        shapeNew.displayInfo();

        SquareExtended squareExtended = new SquareExtended(12);
        squareExtended.findDiag();
        squareExtended.getArea();
        squareExtended.getPeri();
        squareExtended.displayInfo();

        Square square = new SquareExtended(13);
        square.findDiag();
        square.getArea();
        square.getPeri();
        square.displayInfo();
    }
}
