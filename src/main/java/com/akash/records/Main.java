package com.akash.records;

public class Main {
    public static void main(String[] args) {
        Records rec = new Records(12, 101, true, 12.90, "Savings");
        System.out.println(rec.isOpen());
        rec.displayRecords();
    }
}
