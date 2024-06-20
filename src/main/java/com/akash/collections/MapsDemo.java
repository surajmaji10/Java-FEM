package com.akash.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        mapsDemo();
    }

    public static void mapsDemo(){
        Map fruitsCalories = new HashMap();
        fruitsCalories.put("apple", 12);
        fruitsCalories.put("banana", 14);
        fruitsCalories.put("guava", 17);
        System.out.println(fruitsCalories);
        fruitsCalories.put("guava", 20);
        System.out.println(fruitsCalories);
        fruitsCalories.putIfAbsent("apple", 30);
        System.out.println(fruitsCalories);

        System.out.println("size:" + fruitsCalories.size());
        System.out.println("apple calories: " + fruitsCalories.get("apple"));
        fruitsCalories.put("apple", 30);
        System.out.println("apple calories: " + fruitsCalories.get("apple"));
        System.out.println(fruitsCalories);

        System.out.println("contains key banana? " + fruitsCalories.containsKey("banana"));
        System.out.println("contains value 33? " + fruitsCalories.containsValue(33));

        //immutable map
        Map immMap = Map.of(
                "jan", 31,
                "feb", 28,
                "mar", 31,
                "apr", 30

        );
        System.out.println(immMap);
        System.out.println(immMap.size());

    }
}
