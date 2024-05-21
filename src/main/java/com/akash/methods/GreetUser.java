package com.akash.methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        final String greeting = "Hello";
        String name = getUserName();
        greetUserWith(name, greeting);
    }

    private static String getUserName() {
        System.out.print("Enter name : ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        scn.close();
        return name;
    }
    public static void greetUserWith(String name, String greeting){
        System.out.println(greeting + ", " + name + "!");
    }
}
