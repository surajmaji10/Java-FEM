package com.akash.inheritance;

import com.akash.inherit.Person;

public class Runner {
    public static void main(String[] args) {
        Ractangle r = new Ractangle(100, 200);
        Square s = new Square(300);

        System.out.println(r.calculateArea());
        System.out.println(s.calculateArea());

        System.out.println(r.calculatePerimeter());
        System.out.println(s.calculatePerimeter());

        //Person p = new Person();
        //System.out.println(p.getName());
    }
}
