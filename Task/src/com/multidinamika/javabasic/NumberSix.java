package com.multidinamika.javabasic;

import java.util.ArrayList;
import java.util.List;

public class NumberSix {
    public static void main(String[] args) {
        GanjilGenap oddeven = new GanjilGenap();
        List<String> lisOddEven = oddeven.cetak(50);

        for (String ganjilgenap:lisOddEven)
        {
            System.out.println(ganjilgenap+", ");
        }
    }

    public static class GanjilGenap
    {
        private List<String> cetak(int limit)
        {
            List<String> listOddEven = new ArrayList<String>();
            for (int i = 1; i < limit+1 ; i++)
            {
                if (i%2 == 0)
                {
                    if (i%8 == 0)
                    {
                        listOddEven.add("Genap dan Kelipatan delapan");
                    }else {
                        listOddEven.add("Genap");
                    }
                }else if (i%2 == 1)
                {
                    if (i%7 == 0)
                    {
                        listOddEven.add("Ganjil dan Kelipatan tujuh");
                    }else {
                        listOddEven.add("Ganjil");
                    }
                }
            }

            return listOddEven;
        }
    }
}
