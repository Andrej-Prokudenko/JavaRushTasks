package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize(String name){
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "1";
        this.address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "1";
        this.address = null;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "1";
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 1;
        this.name = null;
        this.address = null;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
        this.name = null;
    }//напишите тут ваш код
}
