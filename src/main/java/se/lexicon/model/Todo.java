package se.lexicon.model;

public class Todo {
    public final int toDoId;
    public String description;
    public boolean done;

    public Todo(int toDoId, String description) {
        this.toDoId = toDoId;
        this.description = description;
    }

    public int getToDoId() {
        return toDoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
