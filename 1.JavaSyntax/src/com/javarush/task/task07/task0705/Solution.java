package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());//напишите тут ваш код
        }
        for (int i = 0; i < (array.length/2); i++){
            array1[i] = array [i];
        }
        for (int i = 0; i < (array.length/2); i++){
            array2[i] = array[i+10];
        }
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
