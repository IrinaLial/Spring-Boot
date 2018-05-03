package com.miracleit.miracle.service.impl;

import com.miracleit.miracle.model.Todo;
import com.miracleit.miracle.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    /**
     * {@inheritDoc}
     */
    @Override
    public Todo getUno() {
        final Todo todo = new Todo();
        todo.setCommand("Ivan");
        todo.setStatus("Junoir");
        return todo;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Todo> getTodas() {
        List<Todo> todos = new LinkedList<>();

        final Todo todo = new Todo();
        todo.setCommand("Ivan");
        todo.setStatus("Junoir");
        todos.add(todo);
        todos.add(todo);

        return todos;
    }
}
