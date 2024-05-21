package com.akash.objects;

import java.util.Scanner;

public class Room {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        var len = getRoomLength();
        var wid = getRoomWidth();

        Rectangle room = new Rectangle(len, wid);

        double area = room.calculateArea();
        double peri = room.calculatePerimeter();

        System.out.println("The room that you wish to make will be of:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);
        displayRoomDetails(room);

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
