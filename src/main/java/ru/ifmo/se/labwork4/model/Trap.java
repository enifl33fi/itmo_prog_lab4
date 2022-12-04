package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.Location;

import java.util.Objects;

public class Trap extends Location {
    public Trap(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Trap trap = (Trap) obj;
        return (Objects.equals(this.getName(), trap.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
