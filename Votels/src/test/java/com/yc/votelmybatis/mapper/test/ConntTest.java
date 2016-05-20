package com.yc.votelmybatis.mapper.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConntTest {
	@Test
	public void testConn() {
		Connection con=null;
		
		ApplicationContext cxt=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		SqlSessionFactory factory=(SqlSessionFactory) cxt.getBean("sqlSessionFactory");
		SqlSession session=factory.openSession();
		con=session.getConnection();
		
		assertNotNull(con);
	}

}
