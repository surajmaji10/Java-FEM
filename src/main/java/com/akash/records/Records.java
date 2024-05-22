package com.akash.records;

public record Records(
        int id,
        int accId,
        boolean isOpen,
        double balance,
        String type

) {
        public void displayRecords(){
            System.out.println("Hi, user. You have " + this.type() + " account.");
        }
  }
