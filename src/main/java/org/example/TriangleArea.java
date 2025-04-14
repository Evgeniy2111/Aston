package org.example;

import static java.lang.Math.sqrt;

public class TriangleArea {

    public static double getArea(int a, int b, int c) {

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Отрицательные значения не допустимы");
        }
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("На ноль нелья умножать");
        }

        /*if ((a + b =c) || (a + c = b) || (b + c = a) ) {
            System.out.println("Не верно заданы стороны в треугольлнике");
        }*/
        double s = (a + b + c) / 2;

        System.out.println(sqrt(s * (s - a) * (s - b) * (s - c)));

        return sqrt(s * (s - a) * (s - b) * (s - c));
    }


}
