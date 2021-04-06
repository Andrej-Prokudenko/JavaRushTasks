package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        for (; i > 0; i/=10) {
            int n = i%10;
            if (n%2==0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);//напишите тут ваш код
    }
}
