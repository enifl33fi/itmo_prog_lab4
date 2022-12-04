package ru.ifmo.se.labwork4.status;

public enum StatusOfOpinion {
    SAME("такого же"),
    OTHER("другого"),
    INDIFFERENT("без");

    private final String title;

    StatusOfOpinion(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
