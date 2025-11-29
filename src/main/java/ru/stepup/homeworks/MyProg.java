package ru.stepup.homeworks;

import java.util.List;


public class MyProg {
    public static void main(String[] args) {
        Student student1 = new Student("Иван");
        student1.addGrades(List.of(4, 4, 4));
        Student student2 = new Student("Рамазан",List.of(5,4,5));
        student2.addGrades(List.of(5, 5));
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student2.getGrades());
    }
}
