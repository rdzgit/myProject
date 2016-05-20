package com.yc.profiles.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.profile.entity.Profile;
import com.yc.profile.seriver.ProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ProfileServiceImplTest {
	
	@Autowired
	private ProfileService profileService;

	@Test
	public void testFindAllProfiles() {
		List<Profile> profiles=profileService.findAllProfiles();
		System.out.println(profiles);
		
		assertNotNull("查询失败!!!",profiles);
	}

	@Test
	public void testFindProfileById() {
		Profile p=profileService.findProfileById(2);
		System.out.println(p);
		
		assertNotNull("查询失败!!!",p);
	}
}
