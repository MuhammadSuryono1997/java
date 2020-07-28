package com.multidinamika.javabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSeven {
    public static void main(String[] args) {
        List<Integer> kabisat = IntStream.rangeClosed(2000, 2010)
                .boxed().collect(Collectors.toList());

        kabisat.stream().forEach(new Kabisat()::get);
    }

    public static class Kabisat
    {
        private void get(Integer i)
        {
            boolean kabisat = (i % 4 ==0 || i % 100 ==0 || i % 400 == 0);
            if (kabisat == true) System.out.println(i + " adalah tahun kabisat");
            else System.out.println(i + " bukan tahun kabisat");
        }
    }
}
