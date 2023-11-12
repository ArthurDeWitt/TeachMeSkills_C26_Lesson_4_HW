package com.teachmeskills.lesson4.HW;

import java.util.Scanner;
/*
2. Создайте и заполните массив случайным числами и выведете
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
            // Генерация случайных чисел в пределах типа int (от -2147483647 до 2147483647)
            array[i] = (int) ((Math.random() * 2 * 2147483647) - 2147483647);
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
        double average = (double) sum / array.length;

        // Выводим максимальное, минимальное и среднее значение
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
        System.out.println("Average value is: " + average);
    }
}
