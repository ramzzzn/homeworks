package ru.stepup.homeworks;

import java.util.List;
import java.util.ArrayList;


public class Student {
    private final String name;
    private final List <Integer> grades;

    public Student(String name, List<Integer> grades) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Имя студента не может быть пустым");
        }
        for (int grade : grades) {
            if (grade < 2 || grade > 5) {
                throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
            }
        }
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

    public void addGrades(List<Integer> newGrades){
        for (int grade : newGrades) {
            if (grade < 2 || grade > 5) {
                throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
            }
        }
        this.grades.addAll(newGrades);
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
