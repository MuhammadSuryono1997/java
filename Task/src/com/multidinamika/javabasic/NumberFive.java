package com.multidinamika.javabasic;

public class NumberFive {
    public static void main(String[] args) {
        FilmRating film = new FilmRating();
        System.out.println(film.get(12));
    }

    public static class FilmRating
    {
        private String get(int age)
        {
            String result = "";
            if (age >= 21) result = "DEWASA";
            else if (age >= 13) result = "REAMAJA";
            else if (age >= 9) result = "BIMBINGAN ORANG TUA";
            else if (age < 9) result = "SEMUA USIA";
            return result;
        }
    }
}
