package se.lexicon.data;

public class TodoSequencer {

    private static int todoId;

    static int counter = 0;

    public static int nextTodoId() {
        return ++counter;

    }

    public static int getTodoId() {
        return counter;

    }

    public static void resetTodoId() {
        counter = 0;
    }
}
