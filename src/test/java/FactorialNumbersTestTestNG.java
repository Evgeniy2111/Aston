import org.example.FactorialNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialNumbersTestTestNG {

    @Test//тест на проверку факториала 0
    public void testFactorialNumbers() {
        Assert.assertEquals(FactorialNumbers.factorial(0), 1);
    }

    @Test//тест на проверку факториала 5, правильный тест
    public void testFactorialNumbers1() {
        Assert.assertEquals(FactorialNumbers.factorial(5), 120);
    }

    @Test//тест на проверку факториала отрицательного числа
    public void testFactorialNumbers2() {
        Assert.assertEquals(FactorialNumbers.factorial(-1), 120);
    }
}
