package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strings.size(); i++){
            min = strings.get(i).length() < min ? strings.get(i).length() : min;
        }

        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() == min){
                System.out.println(strings.get(i));
            }
        }//напишите тут ваш код
    }
}
