package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int a1 = abs(10 - a);
        int b1 = abs(10 - b);
        if (a1 < b1)
        System.out.println(a);
        else if (b1 < a1)
        System.out.println(b);
        else System.out.println(a);// напишите тут ваш код

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}