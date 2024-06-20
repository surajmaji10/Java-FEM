package com.akash.functional_interfaces;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<Integer, Integer> sqr = (x)-> x*x;
        Function<Integer, Integer> dbl = (x)-> 2*x;

        int x = sqr.andThen(dbl).apply(10);
        System.out.println(x);

    }
}
