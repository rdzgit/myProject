package com.yc.votelmybatis.mapper.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.votelmybatis.entity.Option;
import com.yc.votelmybatis.entity.Subject;
import com.yc.votelmybatis.service.OptionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-common.xml","classpath:spring-mybatis.xml"})
public class OptionServiceImplTest {
	@Autowired
	private OptionService optionService;

	@Test
	public void testAddOptions() {
		List<Option> options=new ArrayList<Option>();
		
		Subject s=new Subject();
		s.setId(62);
		
		Option o1=new Option("门前", 0);
		Option o2=new Option("大桥下", 1);
		
		o1.setSubject(s);
		o2.setSubject(s);
		
		options.add(o1);
		options.add(o2);
		optionService.addOptions(options);
	}

}
