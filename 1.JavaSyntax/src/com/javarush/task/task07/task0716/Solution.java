package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> result = new ArrayList<>();

        for (String string : strings) {
            boolean containR = string.contains("р");
            boolean containL = string.contains("л");

            if (!containL && containR) {
                continue;//напишите тут ваш код
            }

            if (containL && !containR) {
                result.add(string);
            }

            result.add(string);
        }
        return result;
    }
}