package com.miracleit.miracle.service;

import com.miracleit.miracle.model.Todo;

import java.util.List;

public interface TodoService {

    /**
     *
     * @return instance of {@link Todo}
     */

    public Todo getUno();

    /**
     *
     * @return list of todos;
     */

    public List<Todo> getTodas();

}
