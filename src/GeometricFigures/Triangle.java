package GeometricFigures;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricFigures implements IntefaceParam {

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
         double s =  getPerimetr()/2;
         return sqrt(s*(s - a) * (s -b) * (s - c));
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
