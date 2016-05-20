package com.yc.votelmybatis.mapper;

import org.springframework.stereotype.Service;

import com.yc.votelmybatis.entity.User;

@Service("userMapper")
public interface UserMapper {
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User userLogin(User user);
}
