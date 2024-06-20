package com.akash.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDemo {
    public static void main(String[] args) {
        queuesDemo();
    }

    public static void queuesDemo(){
        Queue fruits = new LinkedList();

        fruits.add("sona");
        fruits.add("kitna");
        fruits.add("sona");
        fruits.add("hai");

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println("contains hai? " + fruits.contains("hai"));
        System.out.println("contains sona? " + fruits.contains("sona"));

        var removed = fruits.remove();
        System.out.println(removed);
        System.out.println(fruits);
        System.out.println("contains sona? " + fruits.contains("sona"));
        System.out.println(fruits.peek());

    }
}
