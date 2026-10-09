package com.mathy.demo.service;

import com.mathy.demo.models.Todo;
import com.mathy.demo.repository.ToDoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public Todo createTodo(Todo todo){
        return toDoRepository.save(todo);
    }
    public Todo getTodoById(Long id){
        return toDoRepository.findById(id).orElseThrow(()->new RuntimeException("Todo not found"));
    }
    public List<Todo> getTodos(){
        return toDoRepository.findAll();
    }
    public Todo updateTodo(Todo todo){
        return toDoRepository.save(todo);
    }
    public void deleteTodoById(Long id){
        toDoRepository.delete(getTodoById(id));
    }

    public Page<Todo> getAllTodosPages(int page,int size){
        Pageable pageable= PageRequest.of(page,size);
        return toDoRepository.findAll(pageable);
    }
}
