package com.lukefowles.datastructures;

import static com.lukefowles.datastructures.Exercise1.repeatOccurences;
import static com.lukefowles.datastructures.Exercise2.doBracketsMatch;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatOccurences("a,b,b,c,c,c,4,5,e,g"));
        System.out.println(doBracketsMatch("({( })"));
    }
}
