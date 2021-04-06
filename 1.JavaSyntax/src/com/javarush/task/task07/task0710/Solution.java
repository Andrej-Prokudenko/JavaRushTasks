package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>(10);
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());
        arrayList.add(0, reader.readLine());

        for (int i = 0; i <arrayList.size(); i++){
            System.out.println(arrayList.get(i));//напишите тут ваш код
        }
    }
}
