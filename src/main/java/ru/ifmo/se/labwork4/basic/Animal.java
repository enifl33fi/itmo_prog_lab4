package ru.ifmo.se.labwork4.basic;

import ru.ifmo.se.labwork4.status.StatusOfSpeed;

public abstract class Animal implements Entity {
    private final String name;

    public Animal(String name) {
        this.name = name;

    }

    public void climb(Entity entityToClimb){
        System.out.printf("%s вскрабкался на %s%n", this.getName(), entityToClimb.getName());
    }

    public void goTo(Place place, StatusOfSpeed statusOfSpeed){
        System.out.printf("%s %s к %s%n", this.getName(), statusOfSpeed.toString(), place.getName());
    }

    public void goTo(Place place){
        this.goTo(place, StatusOfSpeed.NORMAL);
    }
    public void sleep(){
        System.out.printf("%s лег спать%n", this.getName());
    }

    public void wakeUp(){
        System.out.printf("%s проснулся%n", this.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public void say(String phrase){
        System.out.println(phrase);
    }

    @Override
    public String toString() {
        return name;
    }
}
