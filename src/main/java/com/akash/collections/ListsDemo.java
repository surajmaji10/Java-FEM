package com.akash.collections;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        listsDemo();
    }

    public static void listsDemo(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("carrot");
        fruits.add("guava");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("has banana?" + fruits.contains("banana"));
        fruits.remove("banana");
        System.out.println("has banana?" + fruits.contains("banana"));
        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);

        System.out.println(fruits.indexOf("apple"));
        System.out.println(fruits.lastIndexOf("apple"));

        fruits.set(1, "ripe guava");
        System.out.println(fruits.get(1));
        System.out.println(fruits);


        // create immutable list
        List immutableList = List.of("apple", "ball", "cat", "dog");
        System.out.println(immutableList);
        System.out.println(immutableList.size());




    }
}
