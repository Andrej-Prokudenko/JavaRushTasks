package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int a1;
        private char a2;
        private String a3;
        private long a4;
        private double a5;
        private float a6;

        public Human(){

        }

        public Human(int a1) {
            this.a1 = a1;
        }

        public Human(char a2) {
            this.a2 = a2;
        }

        public Human(String a3) {
            this.a3 = a3;
        }

        public Human(long a4) {
            this.a4 = a4;
        }

        public Human(double a5) {
            this.a5 = a5;
        }

        public Human(float a6) {
            this.a6 = a6;
        }

        public Human(int a1, char a2) {
            this.a1 = a1;
            this.a2 = a2;
        }

        public Human(int a1, char a2, String a3) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
        }

        public Human(double a5, float a6) {
            this.a5 = a5;
            this.a6 = a6;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
