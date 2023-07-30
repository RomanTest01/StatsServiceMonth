import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

        System.out.println("Номер месяца минимальных продаж: " + service.minSales(sales));

    }

    @Test
    public void sumIncomeForAll() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedsumIncome = 180;
        int actualsumIncome = service.getsumIncome(sales);
        Assertions.assertEquals(expectedsumIncome, actualsumIncome);

        System.out.println("Сумма всех продаж: " + service.getsumIncome(sales));
    }

    @Test
    public void averageSumForMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedaverageSum = 15;
        int actualaverageSum = service.getaverageSumMonth(sales);
        Assertions.assertEquals(expectedaverageSum, actualaverageSum);

        System.out.println("Средняя сумма продаж в месяц: " + service.getaverageSumMonth(sales));
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

        System.out.println("Номер месяца максмальных продаж: " + service.maxSales(sales));

    }

    @Test
    public void minaverageMonthAll() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedminaverageMon = 5;
        int actualminaverageMon = service.minaverageMonth(sales);
        Assertions.assertEquals(expectedminaverageMon, actualminaverageMon);

        System.out.println("Количество месяцев, в которых продажу ниже среднего: " + service.minaverageMonth(sales));
    }

    @Test
    public void maxaverageMonthAll() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmaxaverageMon = 7;
        int actualmaxaverageMon = service.maxaverageMonth(sales);
        Assertions.assertEquals(expectedmaxaverageMon, actualmaxaverageMon);

        System.out.println("Количество месяцев, в которых продажу выше среднего: " + service.maxaverageMonth(sales));
    }
}
