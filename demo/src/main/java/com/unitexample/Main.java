package com.unitexample;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] salesData = {5, 12, 20, 8, 15, 30, 12, 18};
        SalesManager salesManager = new SalesManager(salesData);

        int maxSale = salesManager.max();
        System.out.println("The maximum sale is: " + maxSale);

        double trimmedMean = salesManager.calculateTrimmedMean();
        System.out.println("Trimmed mean: " + trimmedMean);
    }
}
