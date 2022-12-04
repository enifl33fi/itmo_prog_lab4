package ru.ifmo.se.labwork4.basic;

public abstract class Leg implements BodyPart {
    String name;

    public Leg(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract void getOld();

    @Override
    public String toString() {
        return name;
    }
}
