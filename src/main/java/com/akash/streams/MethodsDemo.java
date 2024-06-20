package com.akash.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsDemo {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("monday");
        mylist.add("tueday");
        mylist.add("wednesday");
        mylist.add("thursday");
        mylist.add("friday");
        mylist.add("saturday");
        mylist.add("sunday");

        //anyMatchDemo(mylist);
        //allMatchesDemo(mylist);
        //filterDemo(mylist);

        //mapDemo(mylist); /* does not modify original */
        //System.out.println(mylist);

        //reduceDemo(mylist);
        //reduceDemoIntegers();

        collectDemo(mylist);

    }

    private static void collectDemo(List<String> mylist) {

        List ans = mylist.stream()
                .filter(day->day.startsWith("t"))
                .sorted()
                .map(v -> v + " weekday")
                .map(v -> v.transform(w -> w + "!"))
                .collect(Collectors.toList());

        ans.forEach(System.out::println);
    }

    private static void reduceDemoIntegers() {
        List<Integer> myInts = List.of(1, 2, 3, 4, 5);
        int ans = myInts.stream().reduce(0, Integer::sum);
        System.out.println(ans);

        List<Double> myDoubles = List.of(11.4, 21.4, 31.4, 41.4, 5.5);
        System.out.println(myDoubles.stream().reduce(1.0, (x, y) -> x * y));

    }

    private static void reduceDemo(List<String> mylist) {
        String res = mylist.stream()
                .sorted()
                .reduce("", (x, y)-> x + "|" + y);
        System.out.println(res);
    }

    private static void mapDemo(List<String> mylist) {
        mylist.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void filterDemo(List<String> mylist) {
        mylist.stream()
                .filter(v->v.startsWith("s"))
                .forEach(System.out::println);
    }

    private static void allMatchesDemo(List<String> mylist) {
        boolean allMatches = mylist.stream()
                                    .allMatch(v->v.contains("day"));
        System.out.println(allMatches);
    }

    private static void anyMatchDemo(List<String> mylist) {

       boolean anyMatches =  mylist.stream()
                                    .anyMatch(v->v.contains("th"));
        System.out.println(anyMatches);
    }
}
