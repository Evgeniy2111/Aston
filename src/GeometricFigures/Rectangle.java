package GeometricFigures;

public class Rectangle extends GeometricFigures implements IntefaceParam {

    private double a, b;

    public Rectangle(double a, double b, String fColor, String bColor) {
        super(fColor, bColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void setBColor(String color) {
        this.bColor = color;
    }

    @Override
    public void setFColor(String color) {
        this.fColor = color;
    }

    @Override
    public String getBColor() {
        return bColor;
    }

    @Override
    public String getFColor() {
        return fColor;
    }
}
