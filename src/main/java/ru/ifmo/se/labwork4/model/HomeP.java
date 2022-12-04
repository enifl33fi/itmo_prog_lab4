package ru.ifmo.se.labwork4.model;

import ru.ifmo.se.labwork4.basic.Item;
import ru.ifmo.se.labwork4.basic.Location;

public class HomeP extends Location {
    Board board = new Board("доска", "Посторонним В.");
    public HomeP(String name){
        super(name);
    }

    public void getBoard() {
        System.out.printf("рядом с %s стояла %s с надписью \"%s\"%n", this.getName(), this.board.getName(), this.board.getLabel());
    }

    public class Board extends Item{
        private final String label;
        public Board(String name, String label){
            super(name);
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

    }
}
