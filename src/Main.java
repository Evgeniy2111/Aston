import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        sumOfNumbers(10,8);
        numberValue(-5);
        duplicateLine("Warning", 3);
        leapYear(1600);
        replacingNumbers();
        arrayOfNumber();
        arrayNumbers();
        cubArray();
        arrayString(5, 10);
    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\nBanana" + "\nApple");
    }

    public static void checkSumSing() {
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 53;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 15;
        boolean c = a >= b;
        if (c) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumOfNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static boolean numberValue(int a) {
        return a >= 0;
    }

    public static void duplicateLine(String String, int a) {
        for (int i = 1; i < a; i++) {
            System.out.println(String);
        }
    }

    public static boolean leapYear(int a) {//цикл я включил, тк затупил, решил, что нужно перебор дат делать будет за какой то период
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

    public static void replacingNumbers() {
        int[] numbers = {1, 0, 0, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(numbers));
    }

    public static void arrayOfNumber() {
        int[] arraySize = new int[100];
        for (int i = 0; i < arraySize.length; i++) {
            arraySize[i] = i; //почему в данном случае не нужно прибавлять 1 или записывать ++,+=, из-за итерации?
        }
        System.out.println(Arrays.toString(arraySize));
    }

    public static void arrayNumbers() {
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] = myArray[i] * 2;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void cubArray() {
        int[][] cub = new int[10][10];
        for (int i = 0; i < cub.length; i++) {
            for (int j = 0; j < cub[0].length; j++) {
                if (cub[i] == cub[j]) {
                    cub[i][j] = 1;
                } else {
                    cub[i][j] = 0;
                }
                System.out.print(cub[i][j]);
            }
            System.out.println();
            // Подскажите, пожалуйста, как сделать вторую диагональ?
        }
    }

    public static int[] arrayString(int len, int initialValue) {
        int[] stringArray = new int[len];
        for (int i = 0; i < len; i++) {
            stringArray[i] = initialValue;
        }
        System.out.println(Arrays.toString(stringArray));
        return stringArray;
    }
}