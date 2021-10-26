package com.lukefowles.exercises;

public class ReverseString {

    public static void reverseString(String[] string) {
        String [] hello = {"you", "are", "how", "Hello"};
        String [] message = new String[string.length];

        for(int i = 0; i < string.length; i++) {
            message[i] = string[string.length - 1 - i];
            System.out.print(message[i] + " ");
        }

    }
}
