package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                Date d1 = simpleDateFormat.parse(input);
        SimpleDateFormat date = new SimpleDateFormat("MMM dd, yyy", Locale.ENGLISH);
                String d2 = date.format(d1);
        System.out.println(d2.toUpperCase());
        //напишите тут ваш код
    }
}
