package com.multidinamika.javabasic;

public class NumberThree {
    public static void main(String[] args) {
        OddEven oddeven = new OddEven();
        System.out.println(oddeven.get(27));
    }

    public static class OddEven{
        public String get(int x)
        {
            String result = "";

            if (x%2 == 1 )
            {
                if (x%5 == 0)
                {
                    result = "Imperio Aberto";
                }else{
                    result = "Imperio";
                }
            }
            else if (x%2 == 0)
            {
                if (x%4 == 0)
                {
                    result = "Crucio Reducto";
                }else {
                    result = "Crucio";
                }
            }

            return result;
        }
    }
}
