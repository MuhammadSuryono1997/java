package com.multidinamika.javabasic;

import java.util.List;
import java.util.stream.Collectors;

public class NumberTen {
    public static void main(String[] args) {
        var s1 = List.of(3,1,7,4,5,6,8,2);
        var s2 = List.of(8,7,2,8,2,6);

        Irisan irisan = new Irisan();
        System.out.println(irisan.get(s1,s2));
    }

    public static class Irisan
    {
        private List<Integer> get(List listFirst,List listSecond)
        {
            List<Integer> intersect = (List<Integer>) listFirst.stream().filter(listSecond::contains).collect(Collectors.toList());
            return intersect;
        }
    }
}
