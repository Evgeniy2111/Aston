package GeometricFigures;

public class Main {
    public static void main(String[] args) {
        GeometricFigures[] allgeomtricFigures = new GeometricFigures[3];

        allgeomtricFigures[0] = new Сircle(10, "green", "yellow");
        allgeomtricFigures[1] = new Rectangle(10, 10, "blue", "wrote");
        allgeomtricFigures[2] = new Triangle(5, 6, 7, "red", "black");

        for (GeometricFigures geometricFigures : allgeomtricFigures) {
            System.out.println(geometricFigures.toInfo());
        }
    }
}