package org.example;

import static java.lang.Math.sqrt;

//класс по расчету площади треугольника
public class TriangleArea {

    public static double getArea(int a, int b, int c) {
//проверка на отрицательные числа
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными числами");
        } else {
            //проверка на ноль
            if (a == 0 || b == 0 || c == 0) {
                throw new IllegalArgumentException("На ноль нелья умножать");
            }
            //проверка на правильные параметры сторон треугольника
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Не верно заданы стороны в треугольлнике");
            }
        }
        double s = (a + b + c) / 2;

        System.out.println("Resoult: " + sqrt(s * (s - a) * (s - b) * (s - c)));

        return sqrt(s * (s - a) * (s - b) * (s - c));
    }


}
