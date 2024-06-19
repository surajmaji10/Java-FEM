package com.akash.inheritance;

import com.akash.inherit.Person;

import java.util.Scanner;

public class Runner {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the side of the square:");
        int side = scn.nextInt();
        Square s = new Square(side);

        System.out.println("Enter the side of the square:");
        int length = scn.nextInt();
        int breadth = scn.nextInt();
        Ractangle r = new Ractangle(length, breadth);

        System.out.println(r.calculateArea());
        System.out.println(s.calculateArea());

        System.out.println(r.calculatePerimeter());
        System.out.println(s.calculatePerimeter());

        //Person p = new Person();
        //System.out.println(p.getName());

        r.print(100, 200);
        s.print(300);
        s.print(300, 300);
    }
}
