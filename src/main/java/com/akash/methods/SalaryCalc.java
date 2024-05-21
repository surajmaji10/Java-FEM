package com.akash.methods;

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {

        int sales = getSalesCount();
        double netPay = getNetPay(sales);
        System.out.printf("The final salary for this month is: " + netPay);
        /*
        System.out.print("Enter the number of sales you made: ");

        Scanner scn = new Scanner(System.in);
        int numSales = scn.nextInt();
        scn.close();

        double salary = 1000.0;
        double bonus = 250.0;
        int quota = 10;

        if(numSales >= quota){
            salary += bonus;
        }else if (numSales <= 0){
            System.out.println("Why don't you fire this employee with no sales made !!");
        }

        System.out.printf("The final salary for this month is: " + salary);
        */
    }

    public static int getSalesCount(){
        System.out.print("Enter the number of sales you made: ");
        Scanner scn = new Scanner(System.in);
        int numSales = scn.nextInt();
        scn.close();
        return numSales;
    }

    public static double getNetPay(int numSales){
        double salary = 1000.0;
        double bonus = 250.0;
        int quota = 10;

        if(numSales >= quota){
            salary += bonus;
        }else if (numSales <= 0){
            System.out.println("Why don't you fire this employee with no sales made !!");
        }

        return salary;
    }
}
