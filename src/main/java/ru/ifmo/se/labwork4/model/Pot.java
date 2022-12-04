package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.Entity;
import ru.ifmo.se.labwork4.basic.FillableItem;
import ru.ifmo.se.labwork4.basic.Item;
import ru.ifmo.se.labwork4.status.StatusOfFullness;

import java.util.Objects;

public class Pot extends FillableItem {
    private final String label;
    private PaperCover cover = new PaperCover("бумажная крышка");
    public Pot(String name, StatusOfFullness fullness, String label) {
        super(name, fullness);
        this.label = label;
    }

    public Pot(String name, String label) {
        super(name);
        this.label = label;
    }

    public void getLabel() {
        System.out.printf("На %s было написано \"%s\"%n", this.getName(), this.label);
    }

    public static class PaperCover extends Item{
        public PaperCover(String name) {
            super(name);
        }
    }
    public void popOutCover(){
        System.out.printf("У объекта %s пропала %s%n", this.getName(), cover.toString());
        this.cover = null;
    }
    public void placeCover(){
        System.out.printf("У объекта %s появилась новая бумажная крышка%n", this.getName());
        this.cover = new PaperCover("бумажная крышка");;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pot pot = (Pot) obj;
        return (Objects.equals(this.getFullness().toString() + this.getName(), pot.getFullness().toString() + pot.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getFullness().toString().hashCode() + this.getName().hashCode());
    }



}
