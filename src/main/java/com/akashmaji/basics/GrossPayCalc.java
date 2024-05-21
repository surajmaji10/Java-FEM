package com.akashmaji.basics;

import java.util.Scanner;

public class GrossPayCalc {
    public static void main(String[] args) {
        System.out.print("Enter the number of hours you worked? :");
        Scanner scn = new Scanner(System.in);
        int hours = scn.nextInt();
        System.out.print("Enter the pay rate per hour? :");
        double ratePerHour = scn.nextDouble();
        scn.close();
        double amountToBePaid = hours * ratePerHour;
        double taxes = 0.18 * amountToBePaid;
        double finalPayAmount = amountToBePaid - taxes;
        System.out.println("Gross Pay: " + amountToBePaid);
        System.out.println("Taxes: " + taxes);
        System.out.println("Net Pay: " + finalPayAmount);

    }
}
