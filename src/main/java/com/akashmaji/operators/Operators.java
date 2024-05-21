package com.akashmaji.operators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Enter your particulars:");

        Scanner scn = new Scanner(System.in);
        System.out.print("Salary=>");
        double salary = scn.nextDouble();
        System.out.print("Years of Exp=>");
        double yearsOfExp = scn.nextDouble();
        scn.close();

        double minSalaryNeeded = 20_000;
        double minYearsOfExpNeeded = 5;

        /*
        if(salary >= minSalaryNeeded){
            if(yearsOfExp >= minYearsOfExpNeeded){
                System.out.println("Congrats! You are eligible for the loan");
            }else{
                System.out.println("Oops! You are not so experienced");
            }
        }else{
            System.out.println("Uh oh! You don't have enough salary.");
        }
        */

        if(salary >= minSalaryNeeded && yearsOfExp >= minYearsOfExpNeeded){
            System.out.println("Congrats! You qualify for the loan");
        }else{
            System.out.println("Uh oh! You don't have required eligibility.");
        }
    }
}
