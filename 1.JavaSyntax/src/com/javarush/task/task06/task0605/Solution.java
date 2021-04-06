package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double a = weight / (height * height);
            System.out.println(a < 18.5 ? "Недовес: меньше чем 18.5" :
                            a >= 18.5 & a < 25.0 ? "Нормальный: между 18.5 и 25" :
                                    a >= 25.0 & a < 30.0 ? "Избыточный вес: между 25 и 30" :
                                            "Ожирение: 30 или больше");// напишите тут ваш код
        }
    }
}
