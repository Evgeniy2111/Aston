import org.example.NumbersAction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumbersActionTest {

    @ParameterizedTest
    @CsvSource({"0,5", "-1,4", "5,10"})
    public void validateNumbersAction(int a, int d) {
        Assertions.assertEquals(NumbersAction.getResoult(a, 5, "+"),d);
    }

    @ParameterizedTest
    @CsvSource({"0,-5", "-1,-6", "5,0"})
    public void validateNumbersAction1(int a, int d) {
        Assertions.assertEquals(NumbersAction.getResoult(a, 5, "-"), d);
    }
    @ParameterizedTest
    @CsvSource({"0,5", "-1,-5", "5,25"})
    public void validateNumbersAction2(int a, int d) {
        Assertions.assertEquals(NumbersAction.getResoult(a, 5, "*"), d);
    }

    @ParameterizedTest
    @CsvSource({"0,5", "-10,-2", "5,1"})
    public void validateNumbersAction3(int a, int d) {
        Assertions.assertEquals(NumbersAction.getResoult(a, 5, "/"), d);
    }
}
