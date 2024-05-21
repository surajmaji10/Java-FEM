package com.akashmaji.whileloops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of hours worked[1-40]:");
        double maxHours = 40;
        double hoursWorked = scn.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("You have worked more? You must enter valid hours. Try again.");
            hoursWorked = scn.nextDouble();
        }

        System.out.println("Enter the number of hours worked[1-100]:");
        double maxHourlyRate = 100;
        double hourlyRate = scn.nextDouble();

        while(hourlyRate > maxHourlyRate || hourlyRate < 1){
            System.out.println("You have more rate? more? You must enter valid rate. Try again.");
            hourlyRate = scn.nextDouble();
        }

        double grossPay = hoursWorked * hourlyRate;
        System.out.println("Gross Pay : " + grossPay);

        double taxRate = 18;
        double taxPay = grossPay * taxRate / 100;
        System.out.println("Taxes Payable @" + taxRate + "% : " + taxPay);

        double netPay = grossPay - taxPay;
        System.out.println("Net Pay : " + netPay);
    }
}
