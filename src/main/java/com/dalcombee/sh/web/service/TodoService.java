package com.dalcombee.sh.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dalcombee.sh.web.core.persistence.jpa.domain.Todo;
import com.dalcombee.sh.web.core.persistence.jpa.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	TodoRepository todoRepository;

	public List<Todo> getAll() {
		return todoRepository.findAll();
	}

	public void regist(Todo todo) {
		todoRepository.save(todo);
	}

	public Todo find(int todoNo) {
		return todoRepository.findById(todoNo).get();
	}

	public void delete(int todoNo) {
		todoRepository.deleteById(todoNo);
	}
	
}
