package com.multidinamika.javabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberTwo {
    public static void main(String[] args)
    {
        Prima prime = new Prima();
        List<Integer> listPrima = prime.get(1);

        for (Integer i:listPrima)
        {
            System.out.println(i+", ");
        }

        List<Integer> range = IntStream.rangeClosed(1,20)
                .boxed().collect(Collectors.toList());
        range.stream().filter(prime::isPrime).forEach(System.out::println);
    }

    public static class Prima
    {
        public List<Integer> get(int limit)
        {
            List<Integer> listPrima = new ArrayList<Integer>();
            boolean isPrime;

            int i;
            for (i = 2; i < limit+1; i++)
            {
                isPrime = true;
                for (int j = 2; j < i; j++)
                    if ((i % j) == 0) {
                        isPrime = false;
                        break;
                    }
                if (isPrime) listPrima.add(i);
            }
            return listPrima;
        }

        public boolean isPrime(Integer s){
            if (s < 2) return false;

            for (int i = 2; i<s; i++) if (s % i == 0) return false;
            return true;
        }

//        List<Integer> range = IntStream.rangeClosed(start, end)
//                .boxed().collect(Collectors.toList());
    }
}
