package GeometricFigures;

public class Сircle extends GeometricFigures implements PerimetrArea, ColorInfo {

    double radius;

    public Сircle(double radius, String fColor, String bColor) {
        super(fColor, bColor);
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 3.14 * 2 * radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void setFColor(String color) {
        this.fColor = color;
    }

    @Override
    public String getFColor() {
        return fColor;
    }

    @Override
    public void setBColor(String color) {
        this.bColor = bColor;
    }

    @Override
    public String getBColor() {
        return bColor;
    }


}
