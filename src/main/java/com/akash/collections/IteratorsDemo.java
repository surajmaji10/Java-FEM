package com.akash.collections;

import java.sql.Array;
import java.util.*;

public class IteratorsDemo {

    public static void setsDemo(){
        Set fruits = new HashSet();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("shake");
        fruits.add("juicy");

        var itr1 = fruits.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }

    public static void setsDemo2(){
        Set<String> fruits = new HashSet<String>();
        fruits.add("banana2");
        fruits.add("apple2");
        fruits.add("mango2");
        fruits.add("shake2");
        fruits.add("juicy2");

        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }

    public static void setsDemo3(){
        Set<String> fruits = new HashSet<String>();
        fruits.add("banana3");
        fruits.add("apple3");
        fruits.add("mango3");
        fruits.add("shake3");
        fruits.add("juicy3");

        // can do this with Sets, Lists, Queues, and not Maps
        // method reference
        fruits.forEach(System.out::println);

    }


    public static void listsDemo(){
        // iterator() works with Set, List, Queue and not Map
        List days = new ArrayList();
        days.add("mon");
        days.add("tues");
        days.add("wed");
        days.add("thu");
        days.add("fri");

        var itr2 = days.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }

    public static void listsDemo2(){
        // iterator() works with Set, List, Queue and not Map
        List<String> days = new ArrayList<>();
        days.add("mon2");
        days.add("tues2");
        days.add("wed2");
        days.add("thu2");
        days.add("fri2");

        for(String day: days){
            System.out.println(day);
        }
    }


    public static void listsDemo3(){
        // iterator() works with Set, List, Queue and not Map
        List<String> days = new ArrayList<>();
        days.add("mon3");
        days.add("tue3");
        days.add("wed3");
        days.add("thu3");
        days.add("fri3");

        days.forEach(day -> System.out.println(day));

    }

    public static void mapsDemo(){
        Map fruitsCalories = new HashMap();
        fruitsCalories.put("apple", 12);
        fruitsCalories.put("banana", 14);
        fruitsCalories.put("guava", 17);

        Set mapEntries = fruitsCalories.entrySet();
        var itr3 = mapEntries.iterator();
        while(itr3.hasNext()) {
            //System.out.println(itr3.next());
            Map.Entry entry = (Map.Entry)itr3.next();
            System.out.println(entry);
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }
    }

    public static void mapsDemo2(){
        Map<String, Integer> fruitsCalories = new HashMap();
        fruitsCalories.put("apple2", 12);
        fruitsCalories.put("banana2", 14);
        fruitsCalories.put("guava2", 17);

        for(Map.Entry entry: fruitsCalories.entrySet()){
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }

    public static void mapsDemo3(){
        Map<String, Integer> fruitsCalories = new HashMap();
        fruitsCalories.put("apple3", 12);
        fruitsCalories.put("banana3", 14);
        fruitsCalories.put("guava3", 17);

        fruitsCalories.forEach((k, v) -> {
            System.out.println(k + "=>" +  v);
        });
    }

    public static void main(String[] args) {

        //setsDemo();
        //setsDemo2();
        setsDemo3();

        System.out.println("----------------------------------");

        //listsDemo();
        //listsDemo2();
        //listsDemo3();

        System.out.println("----------------------------------");

        //mapsDemo();
        //mapsDemo2();
        //mapsDemo3();

        System.out.println("----------------------------------");
    }
}
