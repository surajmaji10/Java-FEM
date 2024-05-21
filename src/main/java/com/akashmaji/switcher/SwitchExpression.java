package com.akashmaji.switcher;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your grade:");
        Scanner scn = new Scanner(System.in);
        String grade = scn.nextLine();
        scn.close();

        String message = switch(grade){
            case "A", "B" -> "Exceptionally Good";
            case "C", "D" -> "Need to improve";
            case "E" -> "Disgusting";
            case "F" -> {
                System.out.println("Why are you still alive?");
                yield "Die Please";
            }
            default -> "Are bhai.";
        };

        System.out.println(message);
    }
}
