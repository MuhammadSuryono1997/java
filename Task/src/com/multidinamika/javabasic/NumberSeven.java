package com.multidinamika.javabasic;

import java.util.ArrayList;
import java.util.List;

public class NumberSeven {
    public static void main(String[] args) {
        Kabisat kabisat = new Kabisat();
        List<String> listKabisat = kabisat.get(2000,2004);
        for (String i:listKabisat)
        {
            System.out.println(i+", ");
        }
    }

    public static class Kabisat
    {
        private List<String> get(int start, int end)
        {
            List<String> listKabisat = new ArrayList<String>();
            for (int i = start; i < end+1 ; i++) {
                boolean kabisat = (i%4==0 || i%400==0 || i%100 == 0);
                if (kabisat == true)
                {
                    listKabisat.add(i+" adalah tahun kabisat");
                }else{
                    listKabisat.add(i+" bukan tahun kabisat");
                }
            }

            return  listKabisat;
        }
    }
}
