package ru.ifmo.se.labwork4.status;

public enum StatusOfSpeed {
    FAST("побежал рысцой"),
    NORMAL("пошел"),
    SLOW("поплелся");

    private final String title;

    StatusOfSpeed(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
