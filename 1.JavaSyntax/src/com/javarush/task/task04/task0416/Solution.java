package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(reader.readLine());
        double n = minute%5;
        System.out.println((n<3) ? "зеленый" : (n<4) ? "желтый" : "красный");

    }
}