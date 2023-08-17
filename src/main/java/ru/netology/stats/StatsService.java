package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumAmount = 0;
        for (long sale : sales) {
            sumAmount = sumAmount + sale;
        }
        return sumAmount;
    }

    public long averageSalesService(long[] sales) {
        if (sales.length > 0) {
            return sumSales(sales) / sales.length;
        }
        return 0;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsBellowAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSalesService(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSalesService(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
