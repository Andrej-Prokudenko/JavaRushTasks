package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
int a = 1;
int b = 1;
int c = 1;
        int n = 10;
      while (a < 10) {
          while (b <= 10) {
              System.out.print(a * b + " ");
              b++;
          }
          System.out.print("\n");
          a++;
          b = 1;
          while (b <= 10) {
              System.out.print(a * b + " ");
              b++;
          }
      }
       // a = a - n;
      //  n--;
       // b++;
        //while (a <= 10){
         //      System.out.print(a * b + " ");
          //     a = a + 1;
          // }

          // c++;

       // }

            /*while (b < 10){
                b = b + 1;
            System.out.print(a * b + " ");}}
               //  {*/
    }
}
