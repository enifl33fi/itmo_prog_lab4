package ru.ifmo.se.labwork4.action;

import ru.ifmo.se.labwork4.basic.BodyPart;
import ru.ifmo.se.labwork4.basic.FillableSpace;

public interface AbleToShove {
    void shove(FillableSpace fillableSpace, BodyPart whatToShove);
}
