package com.multidinamika.javabasic;

public class NumberOne {

    public static void main(String[] args) {
        int x = 64, y = 2;
        var aritmatika = new Aritmatika();
        System.out.println("Penjumlahan dari "+ x + " dan " +y+ " adalah "+aritmatika.Penjumlahan(x,y)+"\n");
        System.out.println("Pengurangan dari "+ x + " dan " +y+ " adalah "+aritmatika.Pengurangan(x,y)+"\n");
        System.out.println("Perpangkatan dari "+ x + " dan " +y+ " adalah "+aritmatika.Perpangkatan(x,y)+"\n");
        System.out.println(aritmatika.Pengakaran(x,y));
        System.out.println("Pembagian dari "+ x + " dan " +y+ " adalah "+aritmatika.Pembagian(x,y)+"\n");
        System.out.println("Perkalian dari "+ x + " dan " +y+ " adalah "+aritmatika.Perkalian(x,y)+"\n");
    }

    private static class Aritmatika
    {
        public static int Penjumlahan(int x, int y)
        {
            return x + y;
        }

        public static int Pengurangan(int x, int y)
        {
            return x - y;
        }

        public static double Perpangkatan(int x, int y)
        {
            int pangkat = (int) Math.pow(x,y);
            return pangkat;
        }

        public static String Pengakaran(int x, int y)
        {
            var akarx = (int) Math.sqrt(x);
            var akary = (int) Math.sqrt(y);
            return "Akar dari "+x+" adalah "+akarx+"\nAkar dari "+y+" adalah "+akary;
        }

        public static int Pembagian(int x,int y)
        {
            return x/y;
        }

        public static int Perkalian(int x, int y)
        {
            return x*y;
        }
    }

}
