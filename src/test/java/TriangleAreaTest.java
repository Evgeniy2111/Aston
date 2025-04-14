import org.example.TriangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleAreaTest {

    @DisplayName("Correct verssion")
    @Test
    public void validateTriangleArea() {
        Assertions.assertEquals(TriangleArea.getArea(1,2,3),0);
    }
}
