package ru.ifmo.se.labwork4.action;

import ru.ifmo.se.labwork4.basic.Entity;
import ru.ifmo.se.labwork4.basic.FillableSpace;

public interface AbleToPut {
    void put(FillableSpace fillableSpace, Entity whatToPut);
}
