package fr.univ_amu.iut.exercice1;

public class HelloWorld {
    public static String hello(String s) {
        if (s == null || s.isEmpty())
            return "Hello, World!";
        return "Hello, " + s + "!";
    }
}
