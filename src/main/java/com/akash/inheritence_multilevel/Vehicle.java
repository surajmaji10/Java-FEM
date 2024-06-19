package com.akash.inheritence_multilevel;

public class Vehicle {
    public String color;
    public double mileage;
    public String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void getDetails(String name, String color){
        System.out.println("I have a " + name + " of " + color + " color.");
    }
}
