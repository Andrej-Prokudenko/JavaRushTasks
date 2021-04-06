package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i<10; i++){map.put("a"+i,"b" + i);}
        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
        // напишите тут ваш код

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
