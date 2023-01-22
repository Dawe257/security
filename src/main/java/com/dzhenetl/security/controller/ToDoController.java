package com.dzhenetl.security.controller;


import com.dzhenetl.security.entity.ToDoEntity;
import com.dzhenetl.security.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/toDo")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoRepository repository;

    @GetMapping
    public Iterable<ToDoEntity> getToDos() {
        return repository.findAll();
    }
}
