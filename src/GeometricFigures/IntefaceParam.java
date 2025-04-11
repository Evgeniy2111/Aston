package GeometricFigures;

public interface IntefaceParam {

    double getArea();

    double getPerimetr();

    String getBColor();

    String getFColor();

    void setBColor(String color);//цвет контура

    void setFColor(String color);// цвет заливки

    public default String toInfo() {//деффолтный метод в интерфейсе
        return "[ " + getPerimetr() + " , " + getArea() + " , " + getFColor() + " , " + getBColor() + " ]";
    }
}
