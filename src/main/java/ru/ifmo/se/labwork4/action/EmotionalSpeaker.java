package ru.ifmo.se.labwork4.action;

import ru.ifmo.se.labwork4.status.StatusOfSpeaker;

public interface EmotionalSpeaker {
    void say(String phrase, StatusOfSpeaker status);
}
