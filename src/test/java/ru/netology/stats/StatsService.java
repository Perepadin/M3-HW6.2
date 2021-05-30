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
        long minMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale <= sales[(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        long maxMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale >= sales[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public double average(long[] sales) {
        long sum = 0;
        double average = 0;
        long length = sales.length;
        for (long sale : sales) {
            sum += sale;
            average = sum / length;
        }
        return average;
    }
    public long belowAverage(long[] sales, long average) {
        int countMounth = 0;
        for (long sale : sales) {
            if (average < sale)
            countMounth++;
        }
        return countMounth;
    }
    public long UnderAverage(long[] sales, long average) {
        int countMounth = 0;
        for (long sale : sales) {
            if (average > sale)
                countMounth++;
        }
        return countMounth;
    }

}