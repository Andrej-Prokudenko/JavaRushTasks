package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String a = null;

        for (int i = 0; ; i++){
            a = reader.readLine();
            if (a.equals("end")) { break;}
            else list.add(a);//напишите тут ваш код
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}