package com.akashmaji.grader;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        System.out.print("Enter your final grade: ");
        Scanner scn = new Scanner(System.in);
        String grade = scn.nextLine();
        scn.close();

        switch(grade){
            case "A":
                System.out.println("You have done very well.");
                break;
            case "B":
                System.out.println("You have done well");
                break;
            case "C":
                System.out.println("You should improve a bit");
                break;
            default:
                System.out.println("You have failed");
                break;
        }
        System.out.println("Thanks");

    }
}
