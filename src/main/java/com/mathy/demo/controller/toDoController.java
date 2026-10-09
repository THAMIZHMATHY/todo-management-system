package com.mathy.demo.controller;

import com.mathy.demo.service.ToDoService;
import com.mathy.demo.models.Todo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
@Slf4j
public class toDoController {
    @Autowired
    private ToDoService toDoService;
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Todo Retrieved Successfully"),
            @ApiResponse(responseCode = "404",description = "Todo was not found!")
    })
    //get
    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id){
        try {
            Todo createdTodo = toDoService.getTodoById(id);
            return new ResponseEntity<>(createdTodo, HttpStatus.OK);
        }catch (RuntimeException exception){
            log.info("Error");
            log.warn("");
            log.error("",exception);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    ResponseEntity<List<Todo>> getTodos(){
        return new ResponseEntity<List<Todo>>(toDoService.getTodos(),HttpStatus.OK);
    }
    //pagination
    @GetMapping("/pages")
    ResponseEntity<Page<Todo>> getTodosPage(@RequestParam int page, int size){
        return new ResponseEntity<>(toDoService.getAllTodosPages(page,size),HttpStatus.OK);

    }
    //create
    @PostMapping("/create")
    ResponseEntity<Todo> createUser(@RequestBody Todo todo){
        return new ResponseEntity<>(toDoService.createTodo(todo), HttpStatus.CREATED);
    }
    //update
    @PutMapping
    ResponseEntity<Todo> updateTodoById(@RequestBody Todo todo){
        return new ResponseEntity<>(toDoService.updateTodo(todo),HttpStatus.OK);
    }
    //deleteById
    @DeleteMapping("/{id}")
    void deleteTodoById(@PathVariable long id){
        toDoService.deleteTodoById(id);
    }










}
