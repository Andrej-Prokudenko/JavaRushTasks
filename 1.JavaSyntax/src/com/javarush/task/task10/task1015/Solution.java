package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[2];

        ArrayList<String> list1 = new ArrayList<>();//напишите тут ваш код
        for (int i = 0; i<5; i++){
            list1.add("a" + i);
        }

        ArrayList<String> list2 = new ArrayList<>();//напишите тут ваш код
        for (int i = 0; i<5; i++){
            list2.add("z" + i);
        }

        array[0] = list1;
        array[1] = list2;
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}