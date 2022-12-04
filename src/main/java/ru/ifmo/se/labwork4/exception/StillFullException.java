package ru.ifmo.se.labwork4.exception;

public class StillFullException extends Exception{
    public StillFullException(String message) {
        super(message);
    }
    public StillFullException(String message, Throwable cause){
        super(message, cause);
    }
}
