package com.multidinamika.javabasic;

import java.util.ArrayList;
import java.util.List;

public class NumberTwo {
    public static void main(String[] args)
    {
        Prima prime = new Prima();
        List<Integer> listPrima = prime.get(1000);

        for (Integer i:listPrima)
        {
            System.out.println(i+", ");
        }
    }

    public static class Prima
    {
        public List<Integer> get(int limit)
        {
            List<Integer> listPrima = new ArrayList<Integer>();
            boolean isPrime;

            for (int i = 2; i < limit+1; i++)
            {
                isPrime = true;
                for (int j = 2; j < i; j++)
                {
                    if (i%j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    listPrima.add(i);
                }
            }
            return listPrima;
        }
    }
}
