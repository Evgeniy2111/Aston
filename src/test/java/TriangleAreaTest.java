import org.example.TriangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleAreaTest {

    @DisplayName("Correct verssion")
    @ParameterizedTest
    @CsvSource({"4, 4.898979485566356", "0,0", "-1,0", "1,0"})
    public void validateTriangleArea(int a, double d) {
        Assertions.assertEquals(TriangleArea.getArea(a,5,4),d);
    }
}
