package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int sum = 0;
        while (number != -1) {
            number = Integer.parseInt(reader.readLine());
            sum += number;
            if (number == -1)
                break;
        }
        System.out.println(sum);//напишите тут ваш код

    }
}
