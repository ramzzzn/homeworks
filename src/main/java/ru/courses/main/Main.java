package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        int x = parseInt(args[0]);
        int y = parseInt(args[1]);
        System.out.println(x + "^" + y + " = " + pow(x, y));
    }
}
