package ru.ifmo.se.labwork4.action;

import ru.ifmo.se.labwork4.basic.Entity;
import ru.ifmo.se.labwork4.basic.Place;

public interface AbleToCarry {
    void carry(Entity whatToCarry, Place whereToCarry);
}