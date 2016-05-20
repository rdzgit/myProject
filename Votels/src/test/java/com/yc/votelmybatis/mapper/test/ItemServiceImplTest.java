package com.yc.votelmybatis.mapper.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.votelmybatis.entity.OptionUserNumBean;
import com.yc.votelmybatis.service.ItemService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-common.xml","classpath:spring-mybatis.xml"})
public class ItemServiceImplTest {
	@Autowired
	private ItemService itemService;

	@Test
	public void testAddItem() {
		Map<String,Integer> params=new HashMap<String,Integer>();
		params.put("sid", 1);
		params.put("oid", 9);
		params.put("uid", 1);
		
		int result=itemService.addItem(params);
		
		System.out.println(result);
	}
	
	@Test
	public void testGetSubjectResult() {
		List<OptionUserNumBean> result=itemService.getSubjectResult(1);
		System.out.println(result);
	}
}
