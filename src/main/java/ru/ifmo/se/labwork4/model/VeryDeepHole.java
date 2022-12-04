package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.FillableLocation;

import java.util.Objects;

public class VeryDeepHole extends FillableLocation {
    private Object containedObject;

    public VeryDeepHole(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        VeryDeepHole veryDeepHole = (VeryDeepHole) obj;
        return (Objects.equals(this.getName(), veryDeepHole.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
