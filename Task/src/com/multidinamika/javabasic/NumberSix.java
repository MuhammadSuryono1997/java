package com.multidinamika.javabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSix {
    public static void main(String[] args) {
        List<Integer> range = IntStream.rangeClosed(1,200)
                .boxed().collect(Collectors.toList());

        range.stream().forEach(new GanjilGenap()::check);
    }

    public static class GanjilGenap
    {
        private boolean check(int i)
        {
            if (i % 100 == 0) System.out.println(i+". Kelipatan seratus");
            else if (i%2 == 0)
                if (i % 8 == 0) System.out.println(i+". Genap dan Kelipatan delapan");
                else System.out.println(i+". Genap");
            else if (i%2 == 1)
                if (i % 7 == 0) System.out.println(i+". Ganjil dan Kelipatan tujuh");
                else System.out.println(i+". Ganjil");
            return true;
        }
    }
}
