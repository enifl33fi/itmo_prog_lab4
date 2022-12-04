package ru.ifmo.se.labwork4.action;

import ru.ifmo.se.labwork4.basic.FillableSpace;

public interface AbleToLookSomewhere {

    void lookOut(FillableSpace fromWhere);

    void lookInto(FillableSpace whereToLook);
}