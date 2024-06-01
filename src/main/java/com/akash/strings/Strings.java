package com.akash.strings;

public class Strings {
    public static void main(String[] args) {
        String text = "I love coding in Java";
        int numWords = countWords(text);
        String[] words = getWords(text);

         //System.out.println("The text '" + text + "' has " + numWords + " words");
        //System.out.printf("The text has %d words. ", numWords);
       //System.out.println("They are as under:");

        String message = String.format("The text has %d words. They are as under:", numWords);
        System.out.println(message);

        for(String word: words){
            System.out.println(word);
        }
        /* calling a function */
        reverseText(text);
    }

    public static void reverseText(String str){
            for(int i = str.length() - 1; i >= 0; i--){
                System.out.print(str.charAt(i));
            }
    }

    public static int countWords(String text){
        String[] words = getWords(text);
        return words.length;
    }

    public static String[] getWords(String text){
        return text != null ? text.split(" ") : new String[0];
    }
}
