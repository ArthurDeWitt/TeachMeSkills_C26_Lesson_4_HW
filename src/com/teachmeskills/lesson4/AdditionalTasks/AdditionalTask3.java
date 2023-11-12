package com.teachmeskills.lesson4.AdditionalTasks;

/*
Реализация алгоритма сортировки пузырьком
 */

import java.util.Arrays;

public class AdditionalTask3 {
        public static void main(String[] args) {
            // Инициализация массива и вывод в консоль

            int[] array = {-3, 71, 19, 89, -2};

            System.out.println("Array before bubble sorting: " + Arrays.toString(array));
            bubbleSort(array);
            System.out.println("Array after bubble sorting:: " + Arrays.toString(array));
        }

            // Реализация пузырьковой сортировки
        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Обмен элементов
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
}