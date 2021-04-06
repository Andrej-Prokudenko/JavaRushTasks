package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println(a >= b & a >= c & a >= d ? a : b >= a & b >= c & b >= d ? b : c >= b & c >= a & c >= d ? c : d >= b & d >= c & d >= a ? d : a);//напишите тут ваш код

    }
}
