import java.util.Arrays;
import static java.lang.Long.sum;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] myArrayCorrect = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] myArray1 = new String[][]{
                {"1", "10", "11", "12"},
                {"2", "20", "21", "22"},
                {"3", "30", "31", "32"}
        };

        String[][] myArray3 = new String[][]{
                {"F", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "M", "12"},
                {"13", "14", "15", "16"}
        };


        try {
            MyArray.myArraySize(myArrayCorrect);
            System.out.println("Все данные верны." + "\nСумма числовыхх значений равна: " + MyArray.count);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            MyArray.myArraySize(myArray1);
            System.out.println("Все данные верны." + "\nСумма числовыхх значений равна: " + MyArray.count);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            MyArray.myArraySize(myArray3);
            System.out.println("Сумма числовыхх значений равна: " + MyArray.count);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            MyArray.myArraySize(myArrayCorrect);
            System.out.println("Значение в заданной ячейке" + myArrayCorrect[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Данное значение выходит за пределы массива");
        }
    }


}