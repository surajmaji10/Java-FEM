package com.akash.methods;

import java.util.Scanner;

public class TypeInference {
    private static String justForFun = null;
    // var scn = new Scanner(System.in); /* I can't have var as non-local item */
    public static void main(String[] args) {
        System.out.print("Enter some valid String literal : ");
        var scn = new Scanner(System.in);
        justForFun = scn.nextLine();
        System.out.println("'" + justForFun + "' is what you gave");

        scn.close();
    }
}
