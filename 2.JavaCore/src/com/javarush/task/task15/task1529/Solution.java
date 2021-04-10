package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
        String parameter = reader.readLine();
            switch (parameter) {
                case "helicopter":
                    result = new Helicopter();
                    break;
                case "plane":
                    int passenger = Integer.parseInt(reader.readLine());
                    result = new Plane(passenger);
                    break;//add your code here - добавьте код тут
            }
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
