import org.example.TriangleArea;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTestNG {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaTest() {
        Assert.assertEquals(TriangleArea.getArea(-4,5,7),120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaTest1() {
        Assert.assertEquals(TriangleArea.getArea(0, 4, 5), 0);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaTest2() {
        Assert.assertEquals(TriangleArea.getArea(1, 2, 3), 10);
    }

    @Test
    public void testTriangleAreaTest3() {
        Assert.assertEquals(TriangleArea.getArea(3, 4, 5), 6.0);
    }
}
