package com.lukefowles.exercises;

public class LongestWords {

    public static void longestWord(String[] words) {
        int letterCount = 0;
        String longestWords = "";
        for (String word: words){
            if (word.length() > letterCount){
                letterCount = word.length();
            }
        }
        for (String word: words) {
            if (word.length() == letterCount){
                if (longestWords.equals("")){
                    longestWords = longestWords + word;
                }
                else{
                    longestWords = ", " + word;
                }
            }
                System.out.print(longestWords);
        }
    }
}
