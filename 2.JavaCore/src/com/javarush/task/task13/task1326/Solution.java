package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);
        ArrayList<Integer> list = new ArrayList<>();

        int a = 0;
        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a % 2 == 0) {
                list.add(a);
            }
        }

            Collections.sort(list);

            for (Integer i:
                 list) {
                System.out.println(i);
            }

            inputStream.close();
        // напишите тут ваш код
    }
}
