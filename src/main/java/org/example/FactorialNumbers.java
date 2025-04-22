package org.example;

//класс с рассчетом факториала чисел
public class FactorialNumbers {

    public static long factorial(int a) {
        long result = 1;//взял "Long", тк число может выходить за пределы значения "int"
        //тут перечисленны различные условия для вывода информации
        // больше нуля, те 1.
        if (a >= 0) {
            if (a == 0) { // если факториал равен нулю, будет бросаться исключение
                throw new ArithmeticException("На ноль умножать нельзя");
            }

            for (int i = 1; i <= a; ++i) {
                result *= i;
            }
        } else { //если число отрицательное
            result = 0;
            System.out.println("Отрицательные значения недопустимы");
        }
        System.out.println("Resoult of test: " + result);
        return result;
    }
}
