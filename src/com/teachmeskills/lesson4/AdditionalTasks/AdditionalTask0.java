package com.teachmeskills.lesson4.AdditionalTasks;

/*
Создать массив из n случайных целых чисел и выведите его на экран.
Размер массива задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

import java.util.Scanner;
import java.util.Random;

public class AdditionalTask0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Генерация случайных чисел
        Random random = new Random();

        // Запрос ввода размера массива и проверка коррекции ввода. При некорректном вводе, программа просит повторить ввод
        int sizeOfArray;
        do {
            System.out.print("Enter size of array (n): ");
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray <= 5 || sizeOfArray > 10) {
                System.out.println("The array size must be greater than 5 and less than or equal to 10. Please repeat the input.");
            }

            // Проверка, что введённый размер массива больше 5 и меньше или равно 10
        } while (sizeOfArray <= 5 || sizeOfArray > 10);

        // Создание массива корректно заданного размера в диапазоне от -100 до 100 и его вывод в консоль
        int[] array = new int[sizeOfArray];
        System.out.print("Generated array: ");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = random.nextInt(201) - 100;
            System.out.print(array[i] + " ");
        }
        // Создание второго массива n размера
        int[] evenArray = new int[sizeOfArray];

        // Инициализация счётчика чётных элементов
        int evenCount = 0;

        // Проверка, что элемент массива является чётным и добавление этого элемента во второй массив
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }

        // Проверяем, есть ли в первом массиве чётные элементы и выводим их в консоль
        if (evenCount > 0) {
            System.out.println("An array of even elements of the first array: ");

            // Вывод второго массива в консоль
            for (int i = 0; i < evenCount; i++) { // Вывод второго массива на экран
                System.out.print(evenArray[i] + " ");
            }
        } else {
            // Выводим сообщение об отсутствии чётных элементов
                System.out.println("The first array doesn't have even elements");
        }
    }
}
