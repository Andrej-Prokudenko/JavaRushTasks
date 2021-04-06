package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];

        for (int i =0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        /*Arrays.sort(array);*/

        for (int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }



        //напишите тут ваш код
    }
}
