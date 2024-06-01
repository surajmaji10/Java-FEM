package com.akash.strings;

public class TextProcessor {
    public static void main(String[] args) {
        String revText = "I am a long line of a sentence.";
        reverseText(revText);

        String addSpaceText = "IAmAkashMaji.AComputerScienceUndergrad.IAmHappy.";
        addSpaces(addSpaceText);

        String countingWords = "IAmHappy.IAmAkashMaji.";
        countWords(countingWords);
    }

    private static void countWords(String text) {
        System.out.println("The text is:");
        System.out.println(text);
        int count = 0;
        int i = 0;
        while(i < text.length()){
            if(Character.isUpperCase(text.charAt(i))){
                count += 1;
            }
            i += 1;
        }
        System.out.println("The text has " + count + " characters.");
        System.out.println();
    }

    private static void addSpaces(String text) {
        System.out.println("The text is:");
        System.out.println(text);
        StringBuilder modifiedText = new StringBuilder(text);
        int i = 0;
        while(i < modifiedText.length()){
            if(Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i += 1;
            }
            i += 1;
        }
        System.out.println(modifiedText);
        System.out.println();
    }

    public static void reverseText(String text){
        System.out.println("The text is:");
        System.out.println(text);
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.printf("%c", text.charAt(i));
        }
        System.out.println();
        System.out.println();
    }
}
