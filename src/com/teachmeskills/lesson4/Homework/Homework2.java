package com.teachmeskills.lesson4.Homework;

import java.util.Scanner;
import java.util.Arrays;
/*
Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.
 */
public class Homework2 {
    public static void main(String[] args) {

        // Получаем размер массива от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int sizeOfArray = scanner.nextInt();

        // Проверка некорректного ввода размера
        if (sizeOfArray <= 0){
            System.out.println("Enter correct size of array");
            return;
        }

        // Создаем массив заданного размера
        int[] array = new int[sizeOfArray];

        // Заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            // Генерация случайных чисел в пределах от -100 до 100
            array[i] = (int) ((Math.random() *200) - 100);
        }

        // Выводим массив
        System.out.println("Array of random numbers: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Находим максимальное, минимальное и среднее значение
        int max = array[0];
        int min = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }
        // Находим среднее арифметическое число массива
        double average = (double) sum / array.length;

        // Создаем копию исходного массива для сортировки
        int[] sortedArray = Arrays.copyOf(array, array.length);
        // Сортируем массив
        Arrays.sort(sortedArray); // Сортируем массив

        // Инициализируем переменные для хранения значения, максимально приближенного к среднему арифметическому
        int closestToAverage = sortedArray[0];
        double minDifference = Math.abs(sortedArray[0] - average);

        // Проходим по отсортированному массиву и находим значение, наименее отличающееся от среднего значения
        for (int i = 1; i < sortedArray.length; i++) {
            double difference = Math.abs(sortedArray[i] - average);
            if (difference < minDifference) {
                minDifference = difference;
                closestToAverage = sortedArray[i];
            }
        }

        // Выводим максимальное, минимальное, среднее значение и значение элемента максимально приближённое к среднему
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
        System.out.println("Average value is: " + average);
        System.out.println("Value closest to the average: " + closestToAverage);
    }
}
