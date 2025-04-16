package org.example;

//класс, где на вход принимаются 2 целочисленных значения и вид операции
//данный класс можно написать и через кейсы
public class NumbersAction {

    private static double resoult;

    public static double getResoult(int a, int b, String s) {

        if (s == "+") {// сумма
            resoult = a + b;
        }
        if (s == " - ") {// вычетание
            resoult = a - b;
        }
        if (s == "*") {// умножение
            if (a == 0 || b == 0) {
                System.out.println("На ноль нелья умножать");
            }
            resoult = a * b;
        }
        if (s == "/") {// деление
            if (a == 0 || b == 0) {
                System.out.println("На ноль нелья делить");
            }
            resoult = a / b;
        }
        System.out.println("Resoult: " + resoult);
        return resoult;
    }
}
