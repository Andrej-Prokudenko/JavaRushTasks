package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double a1 = convertEurToUsd(1, 0.1);//напишите тут ваш код
        double a2 = convertEurToUsd(2, 0.1);
        System.out.println(a1);
        System.out.println(a2);//напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur*exchangeRate;//напишите тут ваш код

    }
}
