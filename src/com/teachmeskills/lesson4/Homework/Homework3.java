package com.teachmeskills.lesson4.Homework;
/*
Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
 */
import java.util.Arrays;
public class Homework3 {
    public static void main(String[] args) {
        // Создание и вывод массивов в консоль
        int[] firstArray = {97, -6, -90, -4, 62};
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = {49, -92, -14, 69, -40};
        System.out.println(Arrays.toString(secondArray));

        // Инициализация переменных для хранения суммы элементов каждого массива
        double sumFirstArray = 0;
        double sumSecondArray = 0;

        // Расчёт среднеарифметического элементов первого массива
        for (int i = 0; i < firstArray.length; i++) {
            sumFirstArray += firstArray[i];
            double averageFirstArray = sumFirstArray / firstArray.length;
            System.out.println("Average value of the first array is: " + averageFirstArray);

            // Расчёт среднеарифметического элементов второго массива
            for (int j = 0; j < secondArray.length; j++) {
                sumSecondArray += secondArray[i];
                double averageSecondArray = sumSecondArray / secondArray.length;
                System.out.println("Average value of the second array is " + averageSecondArray);

                // Сверяем полученные результаты
                if (averageFirstArray > averageSecondArray) {
                    System.out.println("Average value of the first array GREATER than that of the second array");
                    return;
                } else if (averageFirstArray < averageSecondArray) {
                    System.out.println("Average value of the first array is LESS than that of the second array");
                    return;
                } else {
                    System.out.println("Average value first array is EQUAL to average values of the second array ");
                    return;
                }
            }
        }
    }
}
