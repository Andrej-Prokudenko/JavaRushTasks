package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = getInts();

        int maximum = list[0];
        int minimum = list[0];


        for (int i = 0; i < list.length; i++){
            if (list[i] > maximum){
                maximum = list[i];//напишите тут ваш код
            }
        }
        for (int i = 0; i < list.length; i++){
            if (list[i] < minimum){
                minimum = list[i];//напишите тут ваш код
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }//напишите тут ваш код
}
