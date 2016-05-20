package com.yc.votelmybatis.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.User;
import com.yc.votelmybatis.mapper.UserMapper;
import com.yc.votelmybatis.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	public User userLogin(User user) {
		return userMapper.userLogin(user);
	}

}
