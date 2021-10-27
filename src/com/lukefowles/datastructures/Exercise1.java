package com.lukefowles.datastructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise1 {

    public static String repeatOccurences (String string) {
        String[] letters = string.split("");
        HashMap<String, Integer> letterMap = new HashMap<String, Integer>();
        for(String letter : letters) {
            if (letter.matches("[a-zA-Z]")){
                Integer counter = letterMap.get(letter);
                if (counter == null) {
                    letterMap.put(letter, 1);
                }
                else {
                    letterMap.replace(letter, ++counter);
                }
            }
        }
        return letterMap.toString();
    }
}

//                if (letterMap.containsKey(letter) == false) {
//                    letterMap.put(letter, 1);
//                }
//                else {
//                    Integer counter = letterMap.get(letter);
//                    letterMap.replace(letter, ++counter);
//                }
