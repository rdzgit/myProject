package com.yc.votelmybatis.service;

import com.yc.votelmybatis.entity.User;

public interface UserService {
	/**
	 * 用户注册
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
