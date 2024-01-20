package com.backend.leap.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.leap.controller.TodoCreateRequest;
import com.backend.leap.controller.TodoUpdateRequest;
import com.backend.leap.model.Todo;
import com.backend.leap.repository.TodoRepository;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo create(TodoCreateRequest todoCreateRequest, String username) {
        Todo todo = new Todo(todoCreateRequest.getTitle(), todoCreateRequest.getDescription(), todoCreateRequest.getTargetDate(), username);
        return todoRepository.save(todo);
    }

    public Todo readById(long id, String username) throws Exception {
        Todo todo = todoRepository.findByUsernameAndId(username, id);
        if(todo == null) {
            throw new Exception("Todo not found");
        }
        return todo;
    }

    public List<Todo> readAll(String username) {
        return todoRepository.findAllByUsername(username);
    }


    public List<Todo> readAllByIsCompleted(String username, String isCompleted) throws Exception {
        boolean _isCompleted = isCompletedStringToBoolean(isCompleted);
        return todoRepository.findAllByUsernameAndIsCompleted(username, _isCompleted);
    }


    public void deleteById(long id, String username) throws Exception {
        Todo todo = todoRepository.findByUsernameAndId(username, id);
        if(todo == null) {
            throw new Exception("Todo not found");
        }
        todoRepository.deleteById(id);
    }

    public Todo updateById(long id, TodoUpdateRequest todoUpdateRequest, String username) throws Exception {
        Todo todo = todoRepository.findByUsernameAndId(username, id);
        if(todo == null) {
            throw new Exception("Todo not found");
        }

        todo.setTitle(todoUpdateRequest.getTitle());
        todo.setDescription(todoUpdateRequest.getDescription());
        todo.setTargetDate(todoUpdateRequest.getTargetDate());
        return todoRepository.save(todo);
    }

    public Todo markCompleteById(long id, String username) throws Exception {
        Todo todo = todoRepository.findByUsernameAndId(username, id);
        if(todo == null) {
            throw new Exception("Todo not found");
        }

        todo.setIsCompleted(!todo.getIsCompleted());
        return todoRepository.save(todo);
    }


    private boolean isCompletedStringToBoolean(String isCompleted) throws Exception {
        try {
            return Boolean.parseBoolean(isCompleted);
        } catch (Exception e) {
            throw new Exception("Invalid isCompleted");
        }
    }
}