package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {
    @Test
    public void testСalculateTotalSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.calculateTotalSale(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСalculateAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.calculateAverageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testСalculateMonthMaxSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.calculateMonthMaxSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСalculateMonthMinSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.calculateMonthMinSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСalculateMonthsBeLowAverage() {
        Long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.СalculateMonthsBeLowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testСalculateMonthsBeHighAverage() {
        Long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        long actual = service.СalculateMonthsBeHighAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }