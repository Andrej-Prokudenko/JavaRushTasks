package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countminus = 0;
        int coountplus = 0;
        if (a > 0)
            coountplus++;
        if (b > 0)
            coountplus++;
        if (c > 0)
            coountplus++;
        if (a < 0)
            countminus++;
        if (b < 0)
            countminus++;
        if (c < 0)
            countminus++;
        System.out.println("количество отрицательных чисел: " + countminus);
        System.out.println("количество положительных чисел: " + coountplus);//напишите тут ваш код

    }
}
