package com.miracleit.miracle.controller;

import com.miracleit.miracle.model.Todo;
import com.miracleit.miracle.model.User;
import com.miracleit.miracle.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

 @Autowired
    private TodoService todoService;

    @RequestMapping("/uno")
    public Todo get(){
        return todoService.getUno();

    }
    @RequestMapping("/todas")
    public List<Todo> getAll(){
        return todoService.getTodas();

    }

}
