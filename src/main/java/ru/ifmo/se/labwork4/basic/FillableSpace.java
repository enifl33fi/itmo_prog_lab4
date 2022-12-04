package ru.ifmo.se.labwork4.basic;

public interface FillableSpace {
    void fill(Entity obj);

    void out();

    Entity getContainedObj();
}
