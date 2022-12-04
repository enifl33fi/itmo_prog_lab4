package ru.ifmo.se.labwork4.exception;

public class NatureException extends RuntimeException{
    public NatureException(String message) {
        super(message);
    }
    public NatureException(String message, Throwable cause){
        super(message, cause);
    }
}
