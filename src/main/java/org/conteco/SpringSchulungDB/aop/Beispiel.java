package org.conteco.SpringSchulungDB.aop;

import java.util.ArrayList;

public class Beispiel {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);

        list.stream()
                .map(Beispiel::mupliplyWith2)
                .forEach(System.out::println);
    }

    public static int mupliplyWith2(int a) {
        return a * 2;
    }
}
