package com.yc.cinema.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.mapper.FilminfoMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class FilmServiceImplTest {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void testGetFilmByFilmBran() {
		SqlSession session=sqlSessionFactory.openSession();
		FilminfoMapper filminfoMapper=session.getMapper(FilminfoMapper.class);
		
		FilmBean filmBean=new FilmBean();
		filmBean.setMaxprice(80.0);

		List<Filminfo> infos=filminfoMapper.getFilmByFilmBran(filmBean);
		System.out.println(infos);
		
		assertNotNull(infos);
	}
	
	@Test
	public void testAdd() {
		SqlSession session=sqlSessionFactory.openSession();
		FilminfoMapper filminfoMapper=session.getMapper(FilminfoMapper.class);
		
		Filmtype type=new Filmtype();
		type.setTypeid(10001);
		type.setTypename("a");
		Filminfo film=new Filminfo(0, "b", type, "b", "d", 80.0);
		
		int result=filminfoMapper.add(film);
		
		assertEquals(1,result);
	}

}
