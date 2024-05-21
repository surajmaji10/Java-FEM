package com.akashmaji.dowhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("=============================");
        boolean again = false;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Enter two numbers a and b:");
            double a = scn.nextInt();
            double b = scn.nextInt();
            double sum = a + b;
            System.out.println("The sum of a = " + a + " and b = " + b + " is: sum = " + sum);
            System.out.print("Try again?(true|false):");
            again = scn.nextBoolean();
        }while(again);
        scn.close();
        System.out.println("Thanks!");
    }
}
