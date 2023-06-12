package com.unitexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
class SalesManagerTest {
    @Test
    void testMax() {
        int[] sales = {10, 20, 30, 40, 50};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        assertEquals(50, max, "The max value should be 50");
    }

    @Test
    void testMaxWithNegativeNumbers() {
        int[] sales = {-10, -20, -30, -40, -50};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        assertEquals(-10, max, "The max value should be -10");
    }

    @Test
    void testCalculateTrimmedMean() {
        int[] sales = {10, 20, 30, 40, 50};
        SalesManager salesManager = new SalesManager(sales);
        double trimmedMean = salesManager.calculateTrimmedMean();
        assertEquals(30, trimmedMean, "The trimmed mean should be 30");
    }

    @Test
    void testCalculateTrimmedMeanWithOneNumber() {
        int[] sales = {10};
        SalesManager salesManager = new SalesManager(sales);
        double trimmedMean = salesManager.calculateTrimmedMean();
        assertEquals(0, trimmedMean, "The trimmed mean should be 0 as there are not enough numbers to trim");
    }
}

