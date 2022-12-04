package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.Head;
import java.util.Objects;

public class Muzzle extends Head {

    public Muzzle(String name) {
        super(name);
    }

    @Override
    public void getOld() {
        System.out.printf("Поздравляем, Ваша %s стала старой%n", this.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Muzzle muzzle = (Muzzle) obj;
        return (Objects.equals(this.getName(), muzzle.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
