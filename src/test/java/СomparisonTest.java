import org.example.Сomparison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class СomparisonTest {

    @DisplayName("Validate a < b")
    @Test
    public void validateComparisonTest() {
        Assertions.assertEquals(Сomparison.getComparison(5, 6), 5 < 6);
    }

    @DisplayName("Validate a < b")
    @Test
    public void validateComparisonTest01() {
        Assertions.assertEquals(Сomparison.getComparison(-5, 6), -5 < 6);
    }

    @DisplayName("Validate a > b")
    @Test
    public void validateComparisonTest1() {
        Assertions.assertEquals(Сomparison.getComparison(7, 6), 7 > 6);
    }

    @DisplayName("Validate a > b")
    @Test
    public void validateComparisonTest11() {
        Assertions.assertEquals(Сomparison.getComparison(7, -6), 7 > -6);
    }

    @DisplayName("Validate a = b")
    @Test
    public void validateComparisonTest2() {
        Assertions.assertEquals(Сomparison.getComparison(5, 5), 5 == 5);
    }

    @DisplayName("Validate a = b")
    @Test
    public void validateComparisonTest21() {
        Assertions.assertEquals(Сomparison.getComparison(-5, -5), 5 == 5);
    }
}
