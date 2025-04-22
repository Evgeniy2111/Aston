import org.example.TriangleArea;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTestNG {
    //тест на определение условия "меньше" нуля
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaTest() {
        Assert.assertEquals(TriangleArea.getArea(-4, 5, 7), 120);
    }

    //тест на опреденение условия "сторона равна нулю"
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaTest1() {
        Assert.assertEquals(TriangleArea.getArea(0, 4, 5), 2);
    }

    //тест на не правильне значения сторон в треугольнике
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaTest2() {
        Assert.assertEquals(TriangleArea.getArea(1, 2, 3), 10);
    }

    //корректный тест на нахождение площади
    @Test
    public void testTriangleAreaTest3() {
        Assert.assertEquals(TriangleArea.getArea(3, 4, 5), 6.0);
    }
}
