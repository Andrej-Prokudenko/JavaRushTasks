package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        int n1 = name1.length();
        int n2 = name2.length();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (n1 == n2)
        System.out.println("Длины имен равны");//напишите тут ваш код

    }
}
