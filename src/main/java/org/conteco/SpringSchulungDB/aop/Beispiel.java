package org.conteco.SpringSchulungDB.aop;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Beispiel {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);

        // Methodenreferenzoperator ::
        long sum = list.stream().mapToLong(Beispiel::mupliplyWith2).sum();
        System.out.println(sum);


//        list.stream()
//                .map(Beispiel::mupliplyWith2)
//                .forEach(System.out::println);
    }

    public static int mupliplyWith2(int a) {
        return a * 2;
    }
}
