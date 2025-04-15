import org.example.FactorialNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialNumbersTestTestNG {

    @Test
    public void testFactorialNumbers() {
        Assert.assertEquals(FactorialNumbers.factorial(0), 1);
    }

    @Test
    public void testFactorialNumbers1() {
        Assert.assertEquals(FactorialNumbers.factorial(5), 120);
    }

    @Test
    public void testFactorialNumbers2() {
        Assert.assertEquals(FactorialNumbers.factorial(0),120);
    }
}
