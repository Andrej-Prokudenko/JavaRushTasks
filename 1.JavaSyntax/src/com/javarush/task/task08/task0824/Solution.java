package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human humank1 = new Human("1", true, 1);
        Human humank2 = new Human("1", true, 1);
        Human humank3 = new Human("1", true, 1);

        Human humanm = new Human("m", false, 1, humank1, humank2, humank3);
        Human humanf = new Human("f", true, 1, humank1, humank2, humank3);


        Human humangm1 = new Human("1", false, 1, humanm);
        Human humangm2 = new Human("2", false, 2, humanf);
        Human humangf1 = new Human("f1", true, 2, humanm);
        Human humangf2 = new Human("f2", true, 1, humanf);

        System.out.println(humangm1);
        System.out.println(humangm2);
        System.out.println(humangf1);
        System.out.println(humangf2);

        System.out.println(humanf);
        System.out.println(humanm);

        System.out.println(humank1);
        System.out.println(humank2);
        System.out.println(humank3);

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public Human(String name, boolean sex, int age, Human... children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }//напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
