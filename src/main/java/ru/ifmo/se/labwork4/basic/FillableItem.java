package ru.ifmo.se.labwork4.basic;

import ru.ifmo.se.labwork4.exception.StillFullException;
import ru.ifmo.se.labwork4.status.StatusOfFullness;

public abstract class FillableItem extends Item implements FillableSpace {
    private StatusOfFullness fullness;
    private Entity containedObject;

    public FillableItem(String name, StatusOfFullness fullness) {
        super(name);
        this.fullness = fullness;
    }

    public FillableItem(String name) {
        super(name);
        this.fullness = StatusOfFullness.NULL;
    }

    public StatusOfFullness getFullness() {
        return this.fullness;
    }

    public void setFullness(StatusOfFullness fullness) {
        this.fullness = fullness;
        System.out.printf("Объект %s стал %s%n", this.getName(), this.getFullness());
    }

    @Override
    public Entity getContainedObj() {
        return this.containedObject;
    }

    @Override
    public void fill(Entity containedObject) {
        if (this.containedObject != null) {
            try {
                throw new StillFullException("Нет места");
            } catch (StillFullException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        this.containedObject = containedObject;
        this.setFullness(StatusOfFullness.FULL);
        System.out.printf("В объект %s положили %s%n", this.getName(), containedObject.toString());
    }

    @Override
    public void out() {

        if (this.fullness == StatusOfFullness.NULL && this.containedObject != null) {
            System.out.printf("Из объекта %s пропал %s%n", this.getName(), containedObject.toString());
            this.containedObject = null;
        }
    }


}