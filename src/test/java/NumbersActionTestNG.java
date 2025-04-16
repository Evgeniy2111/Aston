import org.example.NumbersAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumbersActionTestNG {

    @Test//проверка сложения: положительные числа, отрицательное число, ноль
    public void validateNumbersAction() {
        Assert.assertEquals(NumbersAction.getResoult(2, 3, "+"), 5);
        Assert.assertEquals(NumbersAction.getResoult(-2, 3, "+"), 1);
        Assert.assertEquals(NumbersAction.getResoult(0, -3, "+"), -3);
    }

    @Test//проверка вычетания: положительные числа, отрицательное число, ноль
    public void validateNumbersAction1() {
        Assert.assertEquals(NumbersAction.getResoult(5, 3, "-"), 1);
        Assert.assertEquals(NumbersAction.getResoult(-5, 5, "-"), 0);
        Assert.assertEquals(NumbersAction.getResoult(-5, 0, "-"), -5);
    }

    @Test//проверка умножения: положительные числа, отрицательное число, ноль
    public void validateNumbersAction2() {
        Assert.assertEquals(NumbersAction.getResoult(1, 5, "*"), 5);
        Assert.assertEquals(NumbersAction.getResoult(-1, 5, "*"), -5);
        Assert.assertEquals(NumbersAction.getResoult(0, 5, "*"), 0);
    }

    @Test// проверка дкления: положительные числа, отрицательное число, ноль
    public void validateNumbersAction3() {
        Assert.assertEquals(NumbersAction.getResoult(10, 5, "/"), 2);
        Assert.assertEquals(NumbersAction.getResoult(-10, 5, "/"), -2);
        Assert.assertEquals(NumbersAction.getResoult(10, 0, "/"), 0);
    }


}
