package src.com.multidinamika.javabasic;

import com.sun.tools.javac.util.List;

import src.com.multidinamika.javabasic.*;

public class HelloWorld
{
    public static void main(String[] args)
    {
        Utils.helloWorld();

        var list = List.of("1","2","3");
        var total = list.stream().map(Integer::parseInt).filter().reduce(0, Integer::sum);

    }
}