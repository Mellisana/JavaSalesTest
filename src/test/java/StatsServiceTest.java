import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void testMinSales() {
        StatsService service = new StatsService();
        long[] salesData = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};
        int expected = 9;
        // вызываем целевой метод:
        int actual = service.minSales(salesData);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] salesData = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};
        int expected = 8;
        // вызываем целевой метод:
        int actual = service.maxSales(salesData);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long[] salesData = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};
        long expected = 180;
        // вызываем целевой метод:
        long actual = service.sumSales(salesData);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageAmountPerMonthSales() {
        StatsService service = new StatsService();
        long[] salesData = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};
        long expected = 15;
        // вызываем целевой метод:
        double actual = service.averageAmountPerMonthSales(salesData);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        long[] salesData = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};
        int expected = 5;
        // вызываем целевой метод:
        double actual = service.numberOfMonthsBelowAverageSales(salesData);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfMonthsUpAverageSales() {
        StatsService service = new StatsService();
        long[] salesData = {8L, 15L, 13L, 15L, 17L, 20L, 19L, 20L, 7L, 14L, 14L, 18L};
        int expected = 5;
        // вызываем целевой метод:
        double actual = service.numberOfMonthsUpAverageSales(salesData);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
