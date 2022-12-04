package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.FillableLocation;
import ru.ifmo.se.labwork4.basic.Location;

public class HomeW extends Location {
    private final Shelf shelf;
    public HomeW(String name){
        super(name);
        this.shelf = new Shelf("полка");
    }

    public Shelf getShelf() {
        return shelf;
    }

    public class Shelf extends FillableLocation {
        public Shelf(String name){
            super(name);
        }
    }
}
