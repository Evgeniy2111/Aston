package org.example;

//класс, где на вход принимаются 2 целочисленных значения и вид операции
//данный класс можно написать и через кейсы
public class NumbersAction {

    private static double resoult;

    public static double getResoult(int a, int b, String s) {

        if (s == "+") {// сумма
            resoult = a + b;
        } else if (s == " - ") {// вычетание
            resoult = a - b;
        } else if (s == "*") {// умножение
            if (a == 0 || b == 0) {
                throw new ArithmeticException("На ноль нелья умножать");
            }
            resoult = a * b;
        } else if (s == "/") {// деление
            if (a == 0 || b == 0) {
                throw new ArithmeticException("На ноль нелья делить");
            }
            resoult = a / b;
        }
        System.out.println("Resoult: " + resoult);
        return resoult;
    }
//второй способ написания данного задания через кейсы
    /*public static void getResoult1(int a, int b, String s) {
        int i = 0;
        switch (s) {
            case "+":
                i = a + b;
                break;
            case "-":
                i = a - b;
                break;
            case "*":
                if (a == 0 || b == 0) {
                    throw new ArithmeticException("На ноль нельзя умножать");
                }
                i = a * b;
                break;
            case "/":
                if (a == 0 || b == 0) {
                    throw new ArithmeticException("На ноль нельзя делить");
                }
                i = a / b;
                break;
            default:
                System.out.println("Введите корректный знак: '+','-','*'.'/' ");
        }
        System.out.println("Результат: " + i);
    }*/
}
