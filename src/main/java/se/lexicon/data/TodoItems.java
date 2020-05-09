package se.lexicon.data;

import se.lexicon.model.Todo;
import java.util.Arrays;
import static se.lexicon.data.TodoSequencer.nextTodoId;


public class TodoItems {
    private static Todo[] todo = new Todo[0];

    public TodoItems() {

    }

    public TodoItems(Todo[] todo) {
        this.todo = todo;

    }


    public static Todo[] getTodo() {
        return todo;

    }

    public static void setTodo(Todo[] todo) {
        TodoItems.todo = todo;

    }

    public int size() {
        return todo.length;

    }

    public Todo[] findAll() {
        return todo;
    }

    public Todo FindById(int todoId) {
        Todo matchTodo = new Todo();
        for (int i = 0; i < todo.length; i++) {
            if (todoId == todo[i].getTodoId()) {
                matchTodo = todo[i];
                break;

            }
        }

        return matchTodo;

    }

    public Todo[] addNewTodo(String description) {
        Todo addedTodo = new Todo(nextTodoId(), description);
        Todo[] addedTodoArray = Arrays.copyOf(todo, todo.length + 1);
        addedTodoArray[addedTodoArray.length - 1] = addedTodo;
        return addedTodoArray;

    }

    public void clear() {
        todo = new Todo[0];

    }
}