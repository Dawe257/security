package com.dzhenetl.security.repository;

import com.dzhenetl.security.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDoEntity, String> {
}
