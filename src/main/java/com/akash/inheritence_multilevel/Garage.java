package com.akash.inheritence_multilevel;

public class Garage {
    public static void main(String[] args) {
        Lambo lamborghini = new Lambo();
        lamborghini.setColor("Red");
        lamborghini.getDetails();

        Audi fourrings = new Audi("Blue");
        fourrings.getDetails();

        lamborghini.getDetails("Alex", "Purple");
        fourrings.getDetails("Hales", "Pink");
    }

}
