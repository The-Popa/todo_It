package se.lexicon.data;

import se.lexicon.model.Todo;

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

    public Todo[] getAll() {
        return todo;
    }

    public void getById(final int toDoId) {
        Todo matchTodo = new Todo();
        for(int i = 0; i < todo.length; i++) {
            if(toDoId == todo[i].getToDoId()) {
                if(toDoId == todo[i].getToDoId()) {
                    matchTodo = todo[i];
                    break;
                }
            }

            return matchTodo;
        }


            }



        }


