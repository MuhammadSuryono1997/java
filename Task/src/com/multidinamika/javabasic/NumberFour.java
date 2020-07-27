package com.multidinamika.javabasic;

import java.util.List;

public class NumberFour {
    public static void main(String[] args) {
        var list = List.of("Aku","bukanlah","Superman","Aku","juga","bisa","nangis");
        String result = String.join(" ", list);
        System.out.println(result);
    }

}
