package com.teachmeskills.lesson4.Homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // Создаем массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Получаем число от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to remove from array: ");
        int numberToRemove = scanner.nextInt();

        // Проверяем, есть ли такое число в массиве
        boolean numberExists = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToRemove) {
                numberExists = true;
                break;
            }
        }

        // Если число найдено, удаляем его из массива
        if (numberExists) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != numberToRemove) {
                    numbers[count] = numbers[i];
                    count++;
                }
            }

            // Обновляем размер массива через метод (слава гуглу) System.arraycopy
            int[] newArray = new int[count];
            System.arraycopy(numbers, 0, newArray, 0, count);

            // Выводим новый массив
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        } else {
            // Если число не найдено, выводим сообщение
            System.out.println("This number doesn't exist in this array.");
        }
    }
}
