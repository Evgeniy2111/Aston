package GeometricFigures;

public abstract class GeometricFigures implements IntefaceParam {

    String fColor;
    String bColor;

    public GeometricFigures(String fColor, String bColor) {
        this.fColor = fColor;
        this.bColor = bColor;
    }
    public String toInfo(GeometricFigures figures) {
        return toInfo();
    }
}
