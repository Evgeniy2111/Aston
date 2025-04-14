import org.example.FactorialNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialNumbersTest {
    @DisplayName("Validate 5!")
    @Test
    public void validateFactorialNumbersTest() {
        Assertions.assertEquals(FactorialNumbers.factorial(5),120);
    }

    @DisplayName("Validate -1")
    @Test
    public void validateFactorialNumbersTest1() {
        Assertions.assertEquals(FactorialNumbers.factorial(-1),120);
    }

    @DisplayName("Validate 0")
    @Test
    public void validateFactorialNumbersTest2() {
        Assertions.assertEquals(FactorialNumbers.factorial(0),120);
    }
}
