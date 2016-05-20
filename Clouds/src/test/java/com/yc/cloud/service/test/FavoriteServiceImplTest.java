package com.yc.cloud.service.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.cloud.entity.Favorite;
import com.yc.cloud.entity.Tag;
import com.yc.cloud.service.FavoriteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class FavoriteServiceImplTest {
	@Autowired
	private FavoriteService favoriteService;

	@Test
	public void testFindFavByTagNull() {
		List<Favorite> fs=favoriteService.findFavByTagNull();
		System.out.println(fs);
		
		assertNotNull("查询失败!!!",fs);
	}

	@Test
	public void testFindFavByTag() {
		List<Favorite> fs=favoriteService.findFavByTag("b");
		System.out.println(fs);
		
		assertNotNull("查询失败!!!",fs);
	}

	@Test
	public void testGetAllFav() {
		List<Favorite> fs=favoriteService.getAllFav();
		System.out.println(fs);
		
		assertNotNull("查询失败!!!",fs);
	}

	@Test
	public void testAddFav() {
		List<Tag> ts=new ArrayList<Tag>();
		ts.add(new Tag(0, "1", 0));
		ts.add(new Tag(0, "2", 0));
		ts.add(new Tag(0, "zero", 0));
		Favorite f=new Favorite(0, "斩赤红之瞳3", "zero", ts, "sss");
		
		int result=favoriteService.addFav(f);
		assertEquals(1,result);
	}

}
