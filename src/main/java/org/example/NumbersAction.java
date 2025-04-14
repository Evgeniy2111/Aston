package org.example;

public class NumbersAction {

    private static double resoult;

    public static double getResoult(int a, int b, String s) {

        if (s == "+") {
            resoult = a + b;
        }
        if (s == " - ") {
            resoult = a - b;
        }
        if (s == "*") {
            if (a == 0 || b == 0) {
                System.out.println("На ноль нелья умножать");
            }
            resoult = a * b;
        }
        if (s == "/") {
            if (a == 0 || b == 0) {
                System.out.println("На ноль нелья делить");
            }
            resoult = a / b;
        }
        System.out.println("Resoult: " + resoult);
        return resoult;
    }
}
