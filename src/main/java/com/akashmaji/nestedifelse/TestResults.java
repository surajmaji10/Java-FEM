package com.akashmaji.nestedifelse;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        //display prompt
        System.out.println("Enter the marks in the 5 subjects respectively:");
        Scanner scn = new Scanner(System.in);
        //read in marks
        System.out.print("English=>");
        double english = scn.nextDouble();
        System.out.print("Hindi=>");
        double hindi = scn.nextDouble();
        System.out.print("Maths=>");
        double maths = scn.nextDouble();
        System.out.print("Science=>");
        double science = scn.nextDouble();
        System.out.print("Computers=>");
        double computers = scn.nextDouble();
        scn.close();
        //total marks
        double totalMarks = (english + hindi + maths + science + computers);
        //average marks
        double avgMarks = totalMarks/5.0;
        //display stuffs
        System.out.println("You have got " + totalMarks + " in all. Your average is " + avgMarks);
        //calculate grade
        if(avgMarks >= 90.0){
            System.out.println("You have done exceptionally well with 'A' grade !!");
        }else if(avgMarks >= 75){
            System.out.println("You have done very well with 'B' grade");
        }else if(avgMarks >= 60){
            System.out.println("You have done well with 'C' grade");
        }else if(avgMarks >= 40){
            System.out.println("You have scope to improve with 'D' grade");
        }
    }
}
