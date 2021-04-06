package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("1", 1, "1");
        Man man2 = new Man("2", 3, "5");
        Woman woman = new Woman("2", 2, "2");
        Woman woman2 = new Woman("3", 4, "2");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);//напишите тут ваш код
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }//напишите тут ваш код
}
