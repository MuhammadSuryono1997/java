package com.multidinamika.javabasic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumberNine {
    public static void main(String[] args) {
        StringLength strLen = new StringLength();
        System.out.println("Kalimat berikut memiliki panjang "+strLen.strLengthWithArray("lari pagi"));
    }

    public static class StringLength
    {
        private long strLengthWithArray(String str)
        {
            long count = 0;
            List<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
            count = list.stream().count();
            return count;
        }
    }
}
