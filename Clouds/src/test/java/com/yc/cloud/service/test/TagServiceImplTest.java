package com.yc.cloud.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.cloud.entity.Tag;
import com.yc.cloud.service.TagService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TagServiceImplTest {
	@Autowired
	private TagService tagService;

	@Test
	public void testGetAllTag() {
		List<Tag> tags=tagService.getAllTag();
		System.out.println(tags);
		
		assertNotNull("查询失败!!!",tags);
	}

}
