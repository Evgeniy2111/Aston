import org.example.Сomparison;
import org.testng.Assert;
import org.testng.annotations.Test;

public class СomparisonTestNG {

    @Test// на проверку значения "меньше", с положительным значением
    public void validateComparisonTest() {
        Assert.assertEquals(Сomparison.getComparison(5, 6), "5 < 6");
    }

    @Test// на проверку значения "меньше", с отрицательным значением
    public void validateComparisonTest01() {
        Assert.assertEquals(Сomparison.getComparison(-5, 6), "-5 < 6");
    }

    @Test// на проверку значения "больше", с положительным  значением
    public void validateComparisonTest1() {
        Assert.assertEquals(Сomparison.getComparison(7, 6), "7 > 6");
    }

    @Test// на проверку значения "больше", с отрицательным значением
    public void validateComparisonTest11() {
        Assert.assertEquals(Сomparison.getComparison(7, -6), "7 > -6");
    }

    @Test//проверка на значение "равно", при положительных числах
    public void validateComparisonTest2() {
        Assert.assertEquals(Сomparison.getComparison(5, 5), "5 = 5");
    }

    @Test//проверка на значение "равно", при отрицательлных числах
    public void validateComparisonTest21() {
        Assert.assertEquals(Сomparison.getComparison(-5, -5), "-5 = -5");
    }
}
