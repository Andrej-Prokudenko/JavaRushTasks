package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.readLine();
            array2[i] = array1[i].length();
        }
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);//напишите тут ваш код
        }
    }
}
