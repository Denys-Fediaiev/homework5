package com.dz5;


import java.util.Arrays;

public class dz5p1 {
    public static void main(String[] args) {
        System.out.println(areFibNumbers(1,3,8,7));
    }

    public static boolean areFibNumbers(int...numbers){
        int result = 0;
        boolean finalResult = false;

        for (int i = 0; i < numbers.length; i++) {
            double temp = 5 * numbers[i] * numbers[i] - 4;
            double temp1 = 5 * numbers[i] * numbers[i] + 4;
            double sq = (int) Math.sqrt(temp);
            double sq1 = (int) Math.sqrt(temp1);
            if (sq * sq == temp || sq1 * sq1 == temp1){
                result += 1;
            }
        }
        if (result == numbers.length){
            finalResult = true;
        }
        return finalResult;
    }
}
