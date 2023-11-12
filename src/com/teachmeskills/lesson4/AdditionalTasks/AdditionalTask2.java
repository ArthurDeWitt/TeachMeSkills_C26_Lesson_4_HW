package com.teachmeskills.lesson4.AdditionalTasks;

import java.util.Arrays;
/*
Создать массив строк.
Заполните его произвольными именами людей.
Отсортировать массив и вывести результат в консоль.
 */

public class AdditionalTask2 {
    public static void main(String[] args) {
        // Инициализация массива строк
        String[] arrayOfNames = {"Илья", "Вячеслав", "Алексей", "Владимир", "Сергей"};
        Arrays.sort(arrayOfNames);
        System.out.println(Arrays.toString(arrayOfNames));
    }
}

// Результатом сортировки является вывод имён в алфавитном порядке
