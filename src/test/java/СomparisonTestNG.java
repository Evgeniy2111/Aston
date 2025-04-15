import org.example.Сomparison;
import org.testng.Assert;
import org.testng.annotations.Test;

public class СomparisonTestNG {

    @Test
    public void validateComparisonTest() {
        Assert.assertEquals(Сomparison.getComparison(5, 6), "5 < 6");
    }

    @Test
    public void validateComparisonTest01() {
        Assert.assertEquals(Сomparison.getComparison(-5, 6), "-5 < 6");
    }

    @Test
    public void validateComparisonTest1() {
        Assert.assertEquals(Сomparison.getComparison(7, 6), "7 > 6");
    }

    @Test
    public void validateComparisonTest11() {
        Assert.assertEquals(Сomparison.getComparison(7, -6), "7 > -6");
    }

    @Test
    public void validateComparisonTest2() {
        Assert.assertEquals(Сomparison.getComparison(5, 5), "5 = 5");
    }

    @Test
    public void validateComparisonTest21() {
        Assert.assertEquals(Сomparison.getComparison(-5, -5), "5 = 5");
    }
}
