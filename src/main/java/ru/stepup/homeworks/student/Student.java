package ru.stepup.homeworks.student;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя студента не может быть пустым");
        }
        checkGrades(grades);
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void addGrades(List<Integer> newGrades) {
        checkGrades(newGrades);
        this.grades.addAll(newGrades);
    }

    private void checkGrades(List<Integer> grades) {
        for (int grade : grades) {
            if (grade < 2 || grade > 5) {
                throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
            }
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}