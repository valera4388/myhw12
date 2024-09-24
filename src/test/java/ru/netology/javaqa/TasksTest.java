package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void MatchesSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(13, "Сходить к врачу");

        boolean actual = simpleTask.matches("врачу");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(13, "Сходить к врачу");

        boolean actual = simpleTask.matches("доктору");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesEpicTrue() {
        Epic epic = new Epic(0, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesEpicFalse() {
        Epic epic = new Epic(0, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Сметана");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesMeetingTrueTopic() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("версии");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesMeetingTrueProject() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("Приложение");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchesMeetingFalse() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("колбаса");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}