package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }//10

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }//1
    public static void printMatrix(int m, int n, int value) {
        printMatrix(m, n, value);
    }//2

    public static void printMatrix(int m, int n, Integer value) {
        printMatrix(m, n, value);
    }//3

    public static void printMatrix(int m, int n, double value) {
        printMatrix(m, n, value);
    }//4

    public static void printMatrix(int m, int n, Double value) {
        printMatrix(m, n, value);
    }//5

    public static void printMatrix(int m, int n, short value) {
        printMatrix(m, n, value);
    }//6

    public static void printMatrix(int m, int n, Short value) {
        printMatrix(m, n, value);
    }//7

    public static void printMatrix(int m, int n, float value) {
        printMatrix(m, n, value);
    }//8

    public static void printMatrix(int m, int n, Float value) {
        printMatrix(m, n, value);
    }//9

}
