package com.dalcombee.sh.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShWebApplication.class)
//@Transactional
//@Rollback(value = true)
public class ShWebApplicationTest {


	@Test
	public void contextLoads() {
	}
	
}