package ru.geekbrains.homework;

/* Homework 2
*
*@ author Nikolay Bakhvalov
*@ since 2020-02-25
*
*
 */

public class Main {

    public static void main(String[] args) {
        //System.out.println("Task1: ");
        //invertArray();
        //System.out.println("Task2: ");
        //fillArray();
        //System.out.println("Task3: ");
        //changeArray();
        //System.out.println("Task4: ");
        //fillDagonal();
        //

    }

    // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void invertArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println("\nСтало:");
            for (int j : arr) {
                System.out.print(j + " ");
            }

        }
    }

    // Задание 2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i <arr.length ; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
            
        }
    }

    // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <w.length ; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
            System.out.print(w[i] + " ");
        }
    }

    // Задание 4. Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    // заполнить его диагональные элементы единицами;
    public static void fillDagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i == 4 - 1 - j)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
