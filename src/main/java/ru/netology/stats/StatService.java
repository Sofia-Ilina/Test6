package ru.netology.stats;

public class StatService {
    public long calculateTotalSale(long[] sales) {
        long TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;

        }
        return TotalSale;

    }

    public long calculateAverageSale(long[] sales) {
        long TotalSale = calculateTotalSale(sales);
        long AverageSale = TotalSale / 12;

        return AverageSale;
    }

    public int calculateMonthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int calculateMonthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int СalculateMonthsBeLowAverage(long[] sales) {
        long AverageSale = СalculateMonthsBeLowAverage(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < AverageSale) {
                counter++;
            }
        }
        return counter;

    }

    public int СalculateMonthsBeHighAverage(long[] sales) {
        long AverageSale = СalculateMonthsBeHighAverage(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > AverageSale) {
                counter++;
            }
        }
        return counter;
