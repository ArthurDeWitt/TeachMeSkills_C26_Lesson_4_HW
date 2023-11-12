package com.teachmeskills.lesson4.AdditionalTasks;

/*
Создать и заполнить массив.
Вывести массив на экран в строку.
Заменить каждый элемент с нечётным индексом на ноль.
Снова вывести массив на экран на отдельной строке.
 */

import java.util.Arrays;

public class AdditionalTask1 {
    public static void main(String[] args) {
        // Инициализация и вывод массива в строку
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        // Замена элементов с нечетными индексами на ноль
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        // Вывод массива в консоль на отдельной строке после замены элементов с нечётной позицией на 0
        System.out.println("Массив после замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
