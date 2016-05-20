package com.yc.votelmybatis.mapper.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.votelmybatis.entity.User;
import com.yc.votelmybatis.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-common.xml","classpath:spring-mybatis.xml"})
public class UserServiceImplTest {
	@Autowired
	private UserService userService;

	@Test
	public void testAddUser() {
		User user=new User("3", "小明2", "a", 1, 1);
		int result=userService.addUser(user);
		System.out.println(result);
	}

	@Test
	public void testUserLogin() {
		User user=new User("1", "a");
		User cUser=userService.userLogin(user);
		
		System.out.println(cUser);
	}

}
