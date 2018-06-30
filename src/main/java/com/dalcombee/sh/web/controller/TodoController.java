package com.dalcombee.sh.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalcombee.sh.web.core.persistence.jpa.domain.Todo;
import com.dalcombee.sh.web.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/todo")
@RestController
public class TodoController {
	@Autowired
	TodoService todoService;
	
	@GetMapping("/all")
	public List<Todo> all() {
		log.info("called API. /all");
		return todoService.getAll();
	}

	@PostMapping
	public String regist(Todo todo) {
		todoService.regist(todo);
		return "ok";
	}
	
	@GetMapping("/{todoNo}")
	public Todo find(@PathVariable int todoNo) {
		return todoService.find(todoNo);
	}
	
	@DeleteMapping("/{todoNo}")
	public String delete(@PathVariable int todoNo) {
		todoService.delete(todoNo);
		return "ok";
	}
}