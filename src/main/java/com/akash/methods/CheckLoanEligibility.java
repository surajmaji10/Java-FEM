package com.akash.methods;

import java.util.Scanner;

public class CheckLoanEligibility {
    private static final int requiredCreditScore = 700;
    private static final double requiredSalary = 50_000;
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();

        boolean isEligible = checkLoanEligibility(salary, creditScore);
        notifyUser(isEligible);
    }

    private static void notifyUser(boolean isEligible) {
        if(isEligible){
            System.out.println("Congrats! You are eligible for the loan :)");
        }else{
            System.out.println("Uh ho! Your request has been declined :(");
        }
        scn.close();
    }

    private static boolean checkLoanEligibility(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static double getSalary() {
        System.out.println("Enter your salary[in dollars] : ");
        double salary = scn.nextDouble();
        if(salary >= 0)
            return salary;
        else
            return getSalary();
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score[1-1000] : ");
        int creditScore = scn.nextInt();
        if(creditScore >= 0){
            return creditScore;
        }else{
            return getCreditScore();
        }
    }
}
