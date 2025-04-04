package GeometricFigures;

import java.awt.*;

public abstract class GeometricFigures implements PerimetrArea, ColorInfo {

    String fColor;
    String bColor;
    private double perimetr;
    private double area;

    public GeometricFigures(String fColor, String bColor) {
        this.fColor = fColor;
        this.bColor = bColor;
    }

    @Override
    public double getPerimetr() {
        return perimetr;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getFColor() {
        return fColor;
    }

    public String getBColor() {
        return bColor;
    }

    public String toInfo() {
        return "[ " + getPerimetr() + " , " + getArea() + " , " + getFColor() + " , " + getBColor() + " ]";
    }
}
