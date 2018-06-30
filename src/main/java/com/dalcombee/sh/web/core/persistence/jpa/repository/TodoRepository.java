package com.dalcombee.sh.web.core.persistence.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcombee.sh.web.core.persistence.jpa.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
}
