import org.example.NumbersAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumbersActionTestNG {

    @Test
    public void validateNumbersAction() {
        Assert.assertEquals(NumbersAction.getResoult(2, 3, "+"),5);
        Assert.assertEquals(NumbersAction.getResoult(-2, 3, "+"),1);
        Assert.assertEquals(NumbersAction.getResoult(-2, -3, "+"),-5);
    }

    @Test
    public void validateNumbersAction1() {
        Assert.assertEquals(NumbersAction.getResoult(5, 3, "-"), 1);
        Assert.assertEquals(NumbersAction.getResoult(-5, 5, "-"), 0);
        Assert.assertEquals(NumbersAction.getResoult(-5, -3, "-"), -2);
    }

    @Test
    public void validateNumbersAction2() {
        Assert.assertEquals(NumbersAction.getResoult(1, 5, "*"), 5);
        Assert.assertEquals(NumbersAction.getResoult(-1, 5, "*"), -5);
        Assert.assertEquals(NumbersAction.getResoult(0, 5, "*"), 0);
    }

    @Test
    public void validateNumbersAction3() {
        Assert.assertEquals(NumbersAction.getResoult(10, 5, "/"), 2);
        Assert.assertEquals(NumbersAction.getResoult(-10, 5, "/"), -2);
        Assert.assertEquals(NumbersAction.getResoult(10, 0, "/"), 0);
    }


}
