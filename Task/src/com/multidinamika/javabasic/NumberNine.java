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
        private int strLengthWithArray(String str)
        {
            char[] charArr = str.toCharArray();
            int count = 0;
            for (char c: charArr)
            {
                count++;
            }
            return count;
        }
    }
}
