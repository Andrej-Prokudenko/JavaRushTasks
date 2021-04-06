package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int n;
        if (number > 0)
            n = number * 2;
        else if (number <0)
            n = number + 1;
        else n = 0;
        System.out.println(n);//напишите тут ваш код

    }

}