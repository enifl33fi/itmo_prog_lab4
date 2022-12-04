package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.action.*;
import ru.ifmo.se.labwork4.basic.*;
import ru.ifmo.se.labwork4.exception.NatureException;
import ru.ifmo.se.labwork4.status.StatusOfFullness;
import ru.ifmo.se.labwork4.status.StatusOfSpeaker;

import java.util.Objects;

public class WinnieThePooh extends Animal implements InformationProcessor, EmotionalSpeaker, AbleToLick, AbleToCarry, AbleToShove, AbleToDream, AbleToJump, AbleToThink, AbleToGet {
    private final String firstName;
    private final String lastName;

    private final BodyPart head;


    public WinnieThePooh(String firstName, String lastName, BodyPart head) {
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.head = head;
        if (!Objects.equals(head.getClass(), Muzzle.class)){
            throw new NatureException("Почему Винни Пух из Чернобыля?");
        }
    }

    public void lick(FillableItem fillableItemToLick) {
        System.out.printf("%s как следует лизнул %s%n", this.getName(), fillableItemToLick.getName());
        switch (fillableItemToLick.getFullness()) {
            case FULL -> fillableItemToLick.setFullness(StatusOfFullness.FEW);
            case FEW, NULL -> fillableItemToLick.setFullness(StatusOfFullness.NULL);
        }
    }

    @Override
    public void lick(Entity entityToLick) {
        System.out.printf("%s как следует лизнул %s%n", this.getName(), entityToLick.getName());
    }

    @Override
    public void shove(FillableSpace fillableSpace, BodyPart whatToShove) {
        System.out.printf("%s сунул в %s %s%n", this.getFirstName(), fillableSpace.toString(), whatToShove.toString());
    }

    @Override
    public void process(Information information) {
        if (information.isCorrectCheck()) {
            System.out.printf("окончательно убедившись, что %s правда%n", information.getText());
        } else {
            System.out.printf("окончательно убедившись, что %s неправда%n", information.getText());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void get(FillableSpace fillableSpace){
        System.out.printf("%s достал из %s %s%n", this.getName(), fillableSpace.toString(), fillableSpace.getContainedObj().toString());
        fillableSpace.out();
    }
    public void get(FillableItem fillableItem){
        System.out.printf("%s достал из %s %s %s%n", this.getName(), fillableItem.toString(), fillableItem.getStatusOfSize().toString(), fillableItem.getContainedObj().toString());
        fillableItem.out();
    }

    public void lookIntoPot(Pot pot){
        pot.getLabel();
        pot.popOutCover();
        System.out.printf("%s заглянул в %s%n", this.getName(), pot.getName());

    }

    @Override
    public void carry(Entity whatToCarry, Place whereToCarry) {
        System.out.printf("%s отнёс %s к %s%n", this.getName(), whatToCarry.toString(), whereToCarry.getName());
    }
    @Override
    public void dream(Entity entityToDreamAbout){
        System.out.printf("%s размечтался о %s%n", this.getName(), entityToDreamAbout.getName());
    }

    @Override
    public void jump(){
        System.out.printf("%s подскочил%n", this.getName());
    }

    @Override
    public void say(String phrase, StatusOfSpeaker status) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), status.toString(), phrase);
    }

    @Override
    public void say(String phrase) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), StatusOfSpeaker.NORMAL.toString(), phrase);
    }

    @Override
    public void think(Entity entity){
        System.out.printf("%s подумал о %s%n", this.getName(), entity.getName());
    }

    @Override
    public int hashCode() {
        return (this.getName()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        WinnieThePooh winnieThePooh = (WinnieThePooh) obj;
        return (Objects.equals(this.getName(), winnieThePooh.getName()));
    }

    public BodyPart getHead() {
        return this.head;
    }
}