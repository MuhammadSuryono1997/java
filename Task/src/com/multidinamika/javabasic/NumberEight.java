package com.multidinamika.javabasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberEight {
    public static void main(String[] args) {
        Count count = new Count();
        List<Integer> list = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        System.out.println(count.NumbersWithoutMax(list));
    }


    public static class Count
    {
        private int NumbersWithoutMax(List<Integer> list)
        {
            int sum, max;
            max = Collections.max(list);
            sum = list.stream().reduce(0, Integer::sum) - max;
            return sum;
        }
    }

}
