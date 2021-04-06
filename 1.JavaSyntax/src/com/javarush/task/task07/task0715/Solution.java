package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 1; i < list.size() + 1; i += 2){
            list.add(i,"именно");//напишите тут ваш код
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
