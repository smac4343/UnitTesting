package com.unitexample;
import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public double calculateTrimmedMean() {
        // Сортируем массив чисел
        Arrays.sort(sales);

        // Удаляем первый и последний элементы массива (минимальное и максимальное значения)
        int[] trimmedNumbers = Arrays.copyOfRange(sales, 1, sales.length - 1);

        // Вычисляем среднее значение массива, отбросив минимальное и максимальное значения
        return Arrays.stream(trimmedNumbers).average().orElse(0);
    }
}
