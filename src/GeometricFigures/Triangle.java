package GeometricFigures;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricFigures implements PerimetrArea, ColorInfo {

    double a, b, c;

    public Triangle(double a, double b, double c, String fColor, String bColor) {
        super(fColor, bColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getArea() { //формула Герона
        return sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
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
