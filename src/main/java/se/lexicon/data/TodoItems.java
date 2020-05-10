package se.lexicon.data;

import se.lexicon.model.Todo;
import java.util.Arrays;
import static se.lexicon.data.TodoSequencer.nextTodoId;


public class TodoItems {
    private static Todo[] todo = new Todo[0];
    public TodoItems() {

    }

    public TodoItems(Todo[] todo) {
        TodoItems.todo = todo;

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
        for (Todo value : todo) {
            if (todoId == value.getTodoId()) {
                matchTodo = value;
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