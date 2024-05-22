package com.akash.objects;

import java.util.Scanner;

public class House {
    public String houseName;
    private final Scanner scn = new Scanner(System.in);

    public House(String houseName) {
        this.houseName = houseName;
    }

    public House(){

    }

    public static void main(String[] args) {
        House house = new House();

        System.out.println("Enter your house name: ");
        house.houseName = house.scn.nextLine();

        Rectangle bedroom = house.getNewRoom("bedroom");
        System.out.println(bedroom.toString());

        Rectangle kitchen = house.getNewRoom("kitchen");
        System.out.println(kitchen.toString());

        double area = house.getHouseArea(bedroom, kitchen);
        System.out.println("The area of the house '"+ house.houseName +"' is: " + area);

        house.scn.close();

    }

    public Rectangle getNewRoom(String roomName){
        System.out.print("Enter length of the " + roomName + ": ");
        double length = scn.nextDouble();
        System.out.print("Enter the width of the " + roomName + ": ");
        double width = scn.nextDouble();

        Rectangle newRoom = new Rectangle(length, width);
        newRoom.name = roomName;
        return newRoom;
    }
    public double getHouseArea(Rectangle room1, Rectangle room2){
        double area1 = room1.calculateArea();
        double area2 = room2.calculateArea();
        return area1 + area2;
    }

}
