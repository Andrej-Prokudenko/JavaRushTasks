package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            arrayList.add(string);
        }

        for (int i = 0; i < 13; i++) {
            String a = arrayList.remove(4);
            arrayList.add(0, a);

        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));//напишите тут ваш код
        }
    }
}
