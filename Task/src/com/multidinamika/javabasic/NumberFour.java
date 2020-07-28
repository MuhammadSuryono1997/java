package com.multidinamika.javabasic;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFour {
    public static void main(String[] args) {
        var list = List.of("Aku","bukanlah","Superman","Aku","juga","bisa","nangis");
        String result = list.stream().distinct().collect(Collectors.joining(" "));;
        System.out.println(result);
    }

}
