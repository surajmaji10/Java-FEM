package com.akash.collections;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    public static void main(String[] args) {
        setsDemo();
    }

    public static void setsDemo(){

        Set fruits = new HashSet();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");

        System.out.println(fruits);
        System.out.println( "fruits contains apple? " + fruits.contains("apple"));
        fruits.remove("apple");
        System.out.println( "fruits contains apple? " + fruits.contains("apple"));
        System.out.println(fruits);

        //create immutable set using Set.of()
        Set fixedSet = Set.of("akash", "maji", "is", "a");
        System.out.println(fixedSet);
        // fixedSet.remove("a"); //RTE

    }
}
