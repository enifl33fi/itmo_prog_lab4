package ru.ifmo.se.labwork4.status;

public enum StatusOfSize {
    VERYBIG("большой-пребольшой"),
    BIG("большой"),
    NORMAL(""),
    SMALL("маленький");

    private final String title;

    StatusOfSize(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
