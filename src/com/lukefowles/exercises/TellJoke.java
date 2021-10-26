package com.lukefowles.exercises;

import java.util.Scanner;

public class TellJoke {

    public static void tellJoke() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Would you like to hear a joke? [yes/no]");
            userInput = scanner.nextLine();
            if (userInput.compareTo("yes") == 0) {
                System.out.println("Luke's knowledge of Java :)");
            }
        }
        while (userInput.compareTo("yes") == 0);
    }

}
