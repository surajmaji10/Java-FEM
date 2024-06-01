package com.akash.arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int SIZE = 100;

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the lottery game!");

        int[] lottery = generateLottery(LENGTH, SIZE);

        //System.out.println(Arrays.toString(lottery));
        System.out.println("The generated lottery is: ");
        showLottery(lottery);
    }

    public static int[] generateLottery(int length, int size){
        int[] lottery = new int[length];
        Random random = new Random();
        for(int i = 0; i < length; i++){
            int randInt = random.nextInt(size);
            while(containsAlready(lottery, randInt)){
                randInt = random.nextInt(size);
            }
            lottery[i] = randInt;
        }
        Arrays.sort(lottery);
        return lottery;
    }

    public static boolean containsAlready(int[] lottery, int value){
        for(int v: lottery){
            if(v == value) return true;
        }
        return false;
    }

    public static void showLottery(int[] lottery){
        System.out.print("| ");
        for(int v: lottery){
            if(v < 10){
                System.out.print("0"+v + " | ");
            }else{
                System.out.print(v + " | ");
            }
        }
    }

}
