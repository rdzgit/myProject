package com.yc.cinema.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.service.TypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TypeServiceImplTest {
	@Autowired
	private TypeService typeService;

	@Test
	public void testFindAllTypes() {
		List<Filmtype> types=typeService.findAllTypes();
		
		System.out.println(types);
		
		assertNotNull(types);
	}

}
