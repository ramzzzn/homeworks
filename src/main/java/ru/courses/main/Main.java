package ru.courses.main;

import ru.stepup.homeworks.geometry.Point;


public class Main {
    public static void main(String[] args) {
        java.awt.Point awtPoint= new java.awt.Point(10, 20);
        System.out.println("AWT Point: " + awtPoint);

        Point myPoint = new ru.stepup.homeworks.geometry.Point(30, 40);
        System.out.println("My Point: " + myPoint);
    }
}
