package ru.courses.main;

public class Sauce {
    String name;
    Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }
}

enum Spiciness{
    NOT("Не острый"),
    HOT("Острый"),
    FLAMING("Очень острый");

    private final String description;

    Spiciness(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
