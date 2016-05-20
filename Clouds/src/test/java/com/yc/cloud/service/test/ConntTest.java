package com.yc.cloud.service.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConntTest {

	@Test
	public void testConnt() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionFactory factory=(SqlSessionFactory) ac.getBean("sqlSessionFactory");
		SqlSession session=factory.openSession();
		Connection con=session.getConnection();
		
		assertNotNull("数据库连接失败!!!",con);
	}

}
