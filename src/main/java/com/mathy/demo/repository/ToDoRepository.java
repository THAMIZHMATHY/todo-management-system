package com.mathy.demo.repository;


import com.mathy.demo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<Todo,Long> {

}
