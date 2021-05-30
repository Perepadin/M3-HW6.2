package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public double average(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        double average = 0;
        long length = sales.length;
        average = sum / length;
        return average;
    }

    public long belowAverage(long[] sales) {
        int countMounth = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        double average = 0;
        long length = sales.length;
        average = sum / length;
        for (long sale : sales) {
            if (average < sale)
                countMounth++;
        }
        return countMounth;
    }

    public long upperAverage(long[] sales) {
        int countMounth = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        double average = 0;
        long length = sales.length;
        average = sum / length;
        for (long sale : sales) {
            if (average > sale)
                countMounth++;
        }
        return countMounth;
    }
}