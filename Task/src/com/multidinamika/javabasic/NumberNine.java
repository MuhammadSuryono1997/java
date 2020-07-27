package com.multidinamika.javabasic;

import java.util.Scanner;

public class NumberNine {
    public static void main(String[] args) {
        StringLength strLen = new StringLength();
        String str = strLen.inputValue();
        System.out.println("Kalimat "+str+" memiliki panjang "+strLen.strLengthWithArray(str));
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

        private String inputValue()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value string : ");
            String sentences = input.nextLine();

            return sentences;

        }
    }
}
