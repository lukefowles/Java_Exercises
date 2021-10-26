package com.lukefowles.exercises;

import java.math.BigDecimal;

public class ToDecimal {

        public static void totalDecimalString() {
        String numbers = "0.90, 1.00, 9.00, 8.78, 0.01";
        String [] numbersArray = numbers.split(", ");
        double total = 0.0;
        for (String number: numbersArray){
            double numberParsed = Double.parseDouble(number);
            total += numberParsed;
        }
        BigDecimal result = BigDecimal.valueOf(total);
        System.out.println(result);

    }
}

