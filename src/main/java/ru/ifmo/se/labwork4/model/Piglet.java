package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.action.*;
import ru.ifmo.se.labwork4.basic.*;
import ru.ifmo.se.labwork4.status.StatusOfOpinion;
import ru.ifmo.se.labwork4.status.StatusOfSpeaker;

import java.util.Objects;

public class Piglet extends Animal implements EmotionalSpeaker, AbleToLookSomewhere, AbleToHaveOpinion, AbleToUnderstand, AbleToPut {
    public Piglet(String name) {
        super(name);
    }

    @Override
    public void put(FillableSpace fillableSpace, Entity whatToPut){
        System.out.printf("%s положил %s в %s%n", this.getName(), whatToPut.getName(), fillableSpace.toString());
        fillableSpace.fill(whatToPut);
    }
    @Override
    public void say(String phrase, StatusOfSpeaker status) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), status.toString(), phrase);
    }

    @Override
    public void say(String phrase) {
        say(phrase, StatusOfSpeaker.NORMAL);
    }

    @Override
    public void lookOut(FillableSpace fromWhere) {
        System.out.printf("%s выглянул из %s%n", this.getName(), fromWhere.toString());
        fromWhere.out();
    }

    @Override
    public void express(StatusOfOpinion statusOfOpinion) {
        System.out.printf("%s был %s мнения%n", this.getName(), statusOfOpinion.toString());
    }

    @Override
    public void lookInto(FillableSpace whereToLook) {
        System.out.printf("%s заглянул в %s%n", this.getName(), whereToLook.toString());
    }

    @Override
    public void understand(Information information){
        System.out.printf("%s понял, ", this.getName());
        class Brain implements InformationProcessor {
            @Override
            public void process(Information information){
                if (information.isCorrectCheck()) {
                    System.out.printf("что %s правда%n", information.getText());
                } else {
                    System.out.printf("что %s неправда%n", information.getText());
                }
            }
            public void pushIdea(){
                process(information);
            }
        }
        Brain brain = new Brain();
        brain.pushIdea();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Piglet piglet = (Piglet) obj;
        return (Objects.equals(this.getName(), piglet.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }

}
