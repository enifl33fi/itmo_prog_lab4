package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.Information;

import java.util.Objects;

public class Statement implements Information {
    private String text;
    private boolean isCorrect;

    public Statement(String text, boolean isCorrect) {
        this.text = text;
        this.isCorrect = isCorrect;
    }
    @Override
    public boolean isCorrectCheck() {
        return this.isCorrect;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Statement statement = (Statement) obj;
        return (Objects.equals(this.getText(), statement.getText()) && this.isCorrect == statement.isCorrect);
    }


    @Override
    public int hashCode() {
        if (this.isCorrect) {
            return (("1" + this.getText()).hashCode());
        } else {
            return (("0" + this.getText()).hashCode());
        }
    }

    @Override
    public String toString() {
        return text;
    }
}
