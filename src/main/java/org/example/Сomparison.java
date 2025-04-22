package org.example;

//класс, принимающий на вход 2 целочисленных значения и сравнивает их между собой
public class Сomparison {

    public static boolean getComparison(int a, int b) {
        //перечислены все условия сравнения
        boolean resoult;
        if (a == b) {
            resoult = a == b;
           // System.out.println("a" + "=" + "b");
        } else if (a > b) {
            resoult = a > b;
            //System.out.println("a" + ">" + "b");
        } else {
            resoult = a < b;
           // System.out.println("a" + "<" + "b");
        }
        System.out.println(resoult);
        return resoult;
    }
}
