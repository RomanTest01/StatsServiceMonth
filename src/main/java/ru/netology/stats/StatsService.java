package ru.netology.stats;

public class StatsService {

    //месяц минимальных продаж
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = minSales(sales);
        return sales[minMonth];
    }

    //сумма всех продаж
    public int getsumIncome(int[] sales) {
        int sumIncome = 0; //сумма продаж
        for (int sum : sales) {
            sumIncome = sumIncome + sum;
        }
        return sumIncome;
    }

    public int sumIncomeForAll(int[] sales) {
        int sumIncome = getsumIncome(sales);
        return sales[sumIncome];
    }

    //средняя сумма продаж в месяц

    public int getaverageSumMonth(int[] sales) {
        int averageSum = getsumIncome(sales);
        int averageMonth = averageSum / 12;
        return averageMonth;

    }

    //месяц максимальных продаж

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = minSales(sales);
        return sales[maxMonth];
    }

    //количество месяцев с продажами ниже среднего

    public int minaverageMonth(int[] sales) {
        int minArMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getaverageSumMonth(sales)) { //убрал знак равно
                minArMonth = minArMonth + 1;
            }
        }
        return minArMonth;
    }

    //количество месяцев с продажаи выше среднего
    public int maxaverageMonth(int[] sales) {
        int maxArMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= getaverageSumMonth(sales)) {
                maxArMonth = maxArMonth + 1;
            }
        }
        return maxArMonth;
    }
}
