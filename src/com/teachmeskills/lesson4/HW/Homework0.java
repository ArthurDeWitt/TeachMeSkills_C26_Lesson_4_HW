package com.teachmeskills.lesson4.HW;

import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        // Исходный массив

        int[] numbers = {-2286, 3372, -16, -4002, -4373, 4553, -878, 2271, 4097, 3078};

        // Создаём логическую переменную для отслеживания найденного числа
        boolean found = false;

        // Ввод числа для поиска
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();

        // Проходим каждое число в массиве с помощью цикла
        for (int number : numbers) {

            // Проверяем равно ли текущее число в массиве искомому
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        // Вывод сообщения найдено число в массиве или нет
        if (found) {
            System.out.println("Yes, there is such a number in the array.");
        } else {
            System.out.println("No, that number is not in the array.");
        }
    }
}
