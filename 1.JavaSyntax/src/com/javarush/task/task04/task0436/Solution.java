package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int a = 1; a <= n; a++) {
            System.out.print("8");}
            for (int b = 1; b < m; b++) {
                System.out.println("");
                for (int a = 1; a <= n; a++)
                    System.out.print("8");
            }
        //напишите тут ваш код

    }
}
