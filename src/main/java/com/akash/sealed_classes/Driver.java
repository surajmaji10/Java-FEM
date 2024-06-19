package com.akash.sealed_classes;

public class Driver {
    public static void main(String[] args) {
        
        Circle c = new Circle("GOLA");
        Rectangle r = new Rectangle("CHAUKA");
        Square s = new Square("CHOKON");

        c.setColor("RED");
        r.setColor("GREEN");
        s.setColor("BLUE");

        c.getDetails();
        r.getDetails();
        s.getDetails();

    }


}
