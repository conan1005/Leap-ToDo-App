package com.backend.leap.controller;


import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backend.leap.model.Todo;


@RestController
public class TodoController {


    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(value = "/api/todo", method = RequestMethod.POST)
    public ResponseEntity<Todo> create(@Valid @RequestBody TodoCreateRequest todoCreateRequest, Principal principal) {
        // create a todo
        return null;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/todo", method = RequestMethod.GET)
    public ResponseEntity<List<Todo>> readAll(Principal principal, @RequestParam(required = false) String isCompleted){
        // return all todos
        return null;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/todo/count", method = RequestMethod.GET)
    public ResponseEntity<Integer> countAll(Principal principal, @RequestParam(required = false) String isCompleted){
        // return the count of all todos
        return null;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/todo/{pageNumber}/{pageSize}", method = RequestMethod.GET)
    public ResponseEntity<List<Todo>> readAllPageable(Principal principal, @PathVariable String pageNumber, @PathVariable String pageSize, @RequestParam(required = false) String isCompleted){
        // return todos according to given count on a single page
        return null;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.GET)
    public ResponseEntity<Todo> read(@PathVariable long id, Principal principal) {
        // return a particular task
        return null;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/todo/{id}/markcomplete", method = RequestMethod.PUT)
    public ResponseEntity<Todo> markComplete(@PathVariable long id, Principal principal) {
        // mark a task as completed
        return null;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Todo> update(@PathVariable long id, @Valid @RequestBody TodoUpdateRequest todoUpdateRequest, Principal principal) {
        // update a given task
        return null;
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable long id, Principal principal) {
        // delete a given task
        return null;
    }
}
