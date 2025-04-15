package org.example;

public class Сomparison {

    public static boolean getComparison(int a, int b) {
        boolean resoult;
        if (a == b) {
            resoult = a == b;
            System.out.println("a" + "=" + "b");
        } else if (a > b) {
            resoult = a > b;
            System.out.println("a" + ">" + "b");
        } else {
            resoult = a < b;
            System.out.println("a" + "<" + "b");
        }
        return resoult;
    }
}
