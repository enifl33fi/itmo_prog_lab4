package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.Leg;

public class PirateLeg extends Leg {
    public PirateLeg(String name) {
        super(name);
    }

    @Override
    public void getOld() {
        System.out.println("i am old enough");
    }
}
