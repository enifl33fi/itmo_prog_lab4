package ru.ifmo.se.labwork4.status;

public enum StatusOfSpeaker {
    NORMAL("сказал"),
    PUZZLED("спросил"),
    DELAY("собирался сказать");

    private final String title;

    StatusOfSpeaker(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}