package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>(20);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));//напишите тут ваш код
        }


        for(int i = 0; i< list.size(); i++) {
            int n = list.get(i);

            if (n%3 == 0 || n%2 == 0) {
                if (n%3 == 0) {
                    list1.add(n);
                }
                if (n%2 == 0) {
                    list2.add(n);
                }
            } else list3.add(n);
        }


        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));//напишите тут ваш код
        }//напишите тут ваш код
    }
}
