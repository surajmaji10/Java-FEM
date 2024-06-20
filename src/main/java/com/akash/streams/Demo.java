package com.akash.streams;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // normal way
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();

        // streams way
        Arrays.stream(arr)
                .forEach(val -> System.out.print(val + " "));

        System.out.println();

        // streams way in parallel
        Arrays.stream(arr)
                .parallel()
                .forEach(System.out::print);

        System.out.println();
    }
}
