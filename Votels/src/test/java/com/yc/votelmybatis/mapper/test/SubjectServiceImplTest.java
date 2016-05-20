package com.yc.votelmybatis.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.votelmybatis.entity.SubjectBean;
import com.yc.votelmybatis.service.SubjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-common.xml","classpath:spring-mybatis.xml"})
public class SubjectServiceImplTest {
	@Autowired
	private SubjectService subjectService;

	@Test
	public void testFindAllSubject() {
		List<SubjectBean> subjects=subjectService.findAllSubject();
		System.out.println(subjects);
	}
	
	@Test
	public void testAddSubject() {
		
		SubjectBean subjectBean=new SubjectBean();
		subjectBean.setTitle("MyTest");
		subjectBean.setType(1);
		
		int result=subjectService.addSubject(subjectBean);
		
		System.out.println(result);
	}

}
