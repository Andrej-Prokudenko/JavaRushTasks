package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings= new ArrayList<>();
       for (int i = 0; i < 5; i++) {
           strings.add(reader.readLine());
       }

        int max = 0;
        for (int i = 0; i < strings.size(); i++){
            max = strings.get(i).length() > max ? strings.get(i).length() : max;
        }

        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() == max){
                System.out.println(strings.get(i));
            }
        }

        /*System.out.println(list1.get(max));*///напишите тут ваш код
    }
}
