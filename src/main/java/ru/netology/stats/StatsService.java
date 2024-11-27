package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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

    public long sumSales(long[] sales) {
        long sumSales = 0; // переменная для суммы

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }

        return sumSales; // возвращаем сумму продаж;
    }

    public double averageAmountPerMonthSales(long[] sales) {
        if (sales.length == 0) {
            return 0; // Если массив пуст, возвращаем 0
        }

        long sumSales = sumSales(sales); // Используем уже существующий метод для суммирования
        return (double) sumSales / sales.length; // Возвращаем среднее значение
    }

    public long numberOfMonthsBelowAverageSales(long[] sales) {
        if (sales.length == 0) {
            return 0; // Если массив не заполнен, возвращаем 0
        }

        double averageSales = averageAmountPerMonthSales(sales); // средняя сумма продаж за месяц
        int countBelowAverage = 0; // Счётчик месяцев с продажами ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                countBelowAverage++;
            }
        }

        return countBelowAverage; // Возвращаем количество месяцев с продажами ниже среднего
    }

    public long numberOfMonthsUpAverageSales(long[] sales) {
        if (sales.length == 0) {
            return 0; // Если массив не заполнен, возвращаем 0
        }

        double averageSales = averageAmountPerMonthSales(sales); // средняя сумма продаж за месяц
        int countUpAverage = 0; // Счётчик месяцев с продажами выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                countUpAverage++;
            }
        }

        return countUpAverage; // Возвращаем количество месяцев с продажами выше среднего
    }
}