package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String a = reader.readLine();
       int b = Integer.parseInt(a);
       if (b%2 == 0 & a.length() == 1 & b >= 1 & b <= 999)
           System.out.println("четное однозначное число");
       else if (b%2 == 0 & a.length() == 2 & b >= 1 & b <= 999)
           System.out.println("четное двузначное число");
       else if (b%2 == 0 & a.length() == 3 & b >= 1 & b <= 999)
           System.out.println("четное трехзначное число");
       else if (b%2 != 0 & a.length() == 1 & b >= 1 & b <= 999)
           System.out.println("нечетное однозначное число");
       else if (b%2 != 0 & a.length() == 2 & b >= 1 & b <= 999)
           System.out.println("нечетное двузначное число");
       else if (b%2 != 0 & a.length() == 3 & b >= 1 & b <= 999)
           System.out.println("нечетное трехзначное число");//напишите тут ваш код
    }
}
