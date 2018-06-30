package com.dalcombee.sh.web.core.persistence.jpa.repository;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dalcombee.sh.web.ShWebApplicationTest;
import com.dalcombee.sh.web.core.persistence.jpa.domain.Todo;

public class TodoRepositoryTest extends ShWebApplicationTest {
	@Autowired
	TodoRepository todoRepository;
	
	@Test
	public void testCRUD() {
		Todo todo = new Todo();
		todo.setTitle("한글되나 헬로로로4");
		todo.setDone(false);
		todo.setCreatedAt(new Date());
		todoRepository.save(todo);
	}

}
