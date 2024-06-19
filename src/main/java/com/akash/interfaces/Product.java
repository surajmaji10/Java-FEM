package com.akash.interfaces;

public interface Product {

    // public abstract methods
    String getName();
    void setName(String name);

    // default methods
    default double getPrice(){
        System.out.println("Hello");
        return -1;
    }
    default void setPrice(double price){
        System.out.println("Bye");
    }

    // static methods
    static String mfgDate(){
        return "Today";
    }

}
