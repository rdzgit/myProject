package com.yc.cinema.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MyBatisUtilTest {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void testGetSqlSession() {
		SqlSession session=sqlSessionFactory.openSession();
		Connection con=session.getConnection();
		assertNotNull(con);
	}
}
