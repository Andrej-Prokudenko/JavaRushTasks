package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int a, int b){
        return Math.max(a, b);
    }

    public static long max(long a, long b){
        return a > b ? a : b;
    }

    public static double max(double a, double b){
        if (a > b) {
            return a;
        }
        return b;
    }//Напишите тут ваши методы
}
