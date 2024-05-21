package com.akashmaji.forloop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loops Demo");

        System.out.print("Enter the number of items you purchased :");
        Scanner scn = new Scanner(System.in);
        int numItems = scn.nextInt();

        System.out.println("Enter the prices of these " + numItems + " items respectively.");
        double totalPrice = 0.0;
        for(int item = 1; item <= numItems; item++){
            System.out.print("Price of item #" + item + " : ");
            double price = scn.nextDouble();
            totalPrice += price;
        }
        System.out.println("The total CP is: " + totalPrice);
        scn.close();
        System.out.println("Thanks!");

    }
}
