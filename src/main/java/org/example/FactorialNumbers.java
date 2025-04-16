package org.example;

//класс с рассчетом факториала чисел
public class FactorialNumbers {

    public static long result = 1;

    public static long factorial(int a) {
//тут перечисленны различные условия для вывода информации
// больше нуля, те 1.
        if (a > 0) {
            for (int i = 1; i <= a; ++i) {
                result *= i;
            }
        } else if (a == 0) { // если факториал равен нулю, будет вычвечиваться сообщение
            result = 0;
            System.out.println("На ноль умножать нельзя");
        } else if (a < 0) { //если число отрицательное
            result = 0;
            System.out.println("Отрицательные значения недопустимы");
        }
        System.out.println("Resoult of test: " + result);
        return result;
    }
}
