package com.akash.abstraction;

public class SquareExtended extends Square{

    public SquareExtended(int side) {
        super(side);
        this.color = "Black";
    }

    @Override
    public void findDiag() {
        double diag = Math.sqrt(2 * side * side);
        System.out.println("Diag: " + diag);
    }

    @Override
    protected void getPeri() {
        int peri = 4 * side;
        System.out.println("Peri: " + peri);
    }

    @Override
    public void getArea() {
        int area = side * side;
        System.out.println("Area: " + area);
    }

}
