package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number != -1) {
                sum = sum + number;
                count++;
            }
            else break;
        }
        System.out.println((double)sum/count);//напишите тут ваш код
    }
}

