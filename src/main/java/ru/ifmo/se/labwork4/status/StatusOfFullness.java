package ru.ifmo.se.labwork4.status;

public enum StatusOfFullness {
    FULL("полный"),
    FEW("не совсем полный"),
    NULL("пустой");

    private final String title;

    StatusOfFullness(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

