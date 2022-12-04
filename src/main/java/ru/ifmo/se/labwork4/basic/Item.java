package ru.ifmo.se.labwork4.basic;

import ru.ifmo.se.labwork4.status.StatusOfSize;

public abstract class Item implements Entity {
    private final String name;
    private final StatusOfSize statusOfSize;


    public Item(String name, StatusOfSize statusOfSize) {
        this.name = name;
        this.statusOfSize = statusOfSize;
    }
    public Item(String name) {
        this.name = name;
        this.statusOfSize = StatusOfSize.NORMAL;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }

    public StatusOfSize getStatusOfSize() {
        return this.statusOfSize;
    }
}
