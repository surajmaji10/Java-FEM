package com.akash.objects;

import java.util.Scanner;

public class Room {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        var len = getRoomLength();
        var wid = getRoomWidth();

        Rectangle bedroom = new Rectangle(len, wid);

        double area = bedroom.calculateArea();
        double peri = bedroom.calculatePerimeter();

        System.out.println("The bedroom that you wish to make will be of:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);
        displayRoomDetails(bedroom);

         len = getRoomLength();
         wid = getRoomWidth();

        Rectangle kitchen = new Rectangle(len, wid);

         area = kitchen.calculateArea();
         peri = kitchen.calculatePerimeter();

        System.out.println("The kitchen that you wish to make will be of:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);
        displayRoomDetails(kitchen);

        System.out.println("The total house that you wish to make will be of:");
        System.out.println("Total Area = " + (bedroom.calculateArea() + kitchen.calculateArea()));

        scn.close();
    }

    private static double getRoomWidth() {
        System.out.print("Enter the width : ");
        return scn.nextDouble();
    }
    private static double getRoomLength() {
        System.out.print("Enter the length : ");
        return scn.nextDouble();
    }

    private static void displayRoomDetails(Rectangle room){
          String details =  room.toString();
          System.out.println(details);
    }
}
