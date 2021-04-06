package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)//тут цикл по чтению ключей, пункт 1
        {
            key = reader.readLine();
            boolean a = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger");
            if (!a){
                break;
            }

            switch (key){
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;//создаем объект, пункт 2
            }

            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        if (person instanceof  Person.User){
            ((Person.User) person).live();// пункт 3
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
