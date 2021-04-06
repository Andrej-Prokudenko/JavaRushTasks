package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int a =1;
        int b = 1;
        while (b < 10) {
            while (a <= 10) {
                System.out.print("S");
                a++;//напишите тут ваш код
            }
            System.out.println();
            a = 1;
            b++;
            while (a <= 10) {
                System.out.print("S");
                a++;//напишите тут ваш код
            }
        }
    }
}
