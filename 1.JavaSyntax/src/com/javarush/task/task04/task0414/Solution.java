package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        System.out.println(((year%4==0 & year%100!=0)||(year%400==0))?"количество дней в году: 366":"количество дней в году: 365");//напишите тут ваш код

    }
}