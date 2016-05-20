package com.yc.votelmybatis.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.votelmybatis.entity.User;
import com.yc.votelmybatis.service.UserService;

/**
 * 用户
 * @author Administrator
 *
 */
@Controller("userAction")
public class UserAction implements ModelDriven<User>,SessionAware{
	private User user;
	@Autowired
	private UserService userService;
	private Map<String, Object> session;
	
	public User getModel() {
		user=new User();
		return user;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	/**
	 * 注册
	 * @return
	 */
	public String register(){
		int result=userService.addUser(user);
		if(result>0){
			session.put("currentUser", user);
			return "registerSuccess";
		}
		return "registerFailed";
	}
	
	/**
	 * 登录
	 * @return
	 */
	public String login(){
		User currentUser=userService.userLogin(user);
		if(currentUser!=null){
			session.put("currentUser", currentUser);
			return "manage";
		}
		return "loginFailed";
	}

}
