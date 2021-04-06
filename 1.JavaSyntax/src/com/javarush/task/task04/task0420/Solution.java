package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max1 = a >= b ? a : b;
        int max2 = max1 >= c ? max1 : c;
        int min1 = a <= b ? a : b;
        int min2 = min1 <= c ? min1 : c;
        int avg1 = a + b + c - (max2 + min2);
        //int avg2 = avg1 > a & avg1 < c ? avg1 : avg1 < a & avg1 > c ? avg1 : c;
        //int avg3 = avg2 >
        System.out.println(max2 + " " + avg1 + " " + min2);//напишите тут ваш код

    }
}
