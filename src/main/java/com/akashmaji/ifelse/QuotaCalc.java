package com.akashmaji.ifelse;
import java.util.Scanner;
public class QuotaCalc {
    public static void main(String[] args) {

        System.out.println("Enter the num of sales you made this week? ");

        Scanner scn = new Scanner(System.in);
        int numSales = scn.nextInt();
        scn.close();

        int quota = 10;
        double salary = 2000;
        double bonus = 250;

        if(numSales >= quota){
            System.out.println("Congratulations on achieving this mark!");
            salary += bonus;
        }else if(numSales <= 0){
            System.out.println("You are a disgrace to the company!");
            salary -= bonus;
        }else{
            int shortage = quota - numSales;
            System.out.println("You were short by " + shortage + " sales this week.");
        }

        System.out.println("Your salary will be: " + salary + " USD this week.");

    }
}
