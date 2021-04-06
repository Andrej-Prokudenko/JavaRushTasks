package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;// Считываем с консоли число n - количество чисел для сравнения;
        n = Integer.parseInt(reader.readLine());
        if (n > 0){ // проверяем через if, если n > 0, то выполняется дальнейший код, если нет - ничего;
            int a = Integer.parseInt(reader.readLine());// считываем с консоли число a - первое число для сравнения;
            int maximum = a; // переменной maximum присваиваем значение первого считанного числа а;
            int b;// вне цикла вводим переменную int b;

            for (int i = 1; i < n; i++){//создаем цикл for (int i = 1; i < n; i++);
            b = Integer.parseInt(reader.readLine());// внутри цикла присваиваем переменной b считанные с консоли значения оставшихся n чисел;
            maximum = maximum >= b ? maximum : b;// с помощью тернарного оператора сравниваем
                                                 // переменную maximum (в первый раз - считанное вне цикла значение) с последующими
        }


            System.out.println(maximum);// вывод максимального значения
        }
    }
}
