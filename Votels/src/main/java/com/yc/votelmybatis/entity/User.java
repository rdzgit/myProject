package com.yc.votelmybatis.entity;

import java.io.Serializable;

/**
 * 用户类
 * @author Administrator
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userId; //用户编号
	private String userName; //用户名
	private String password; //密码
	
	private int version=1; //用户是否有效
	private int status=1; //用户角色	1 普通用户	2 管理员
	
	public User() {
		super();
	}
	public User(String userId, String password){
		this.userId = userId;
		this.password = password;
	}
	public User(String userId, String userName, String password, int version,
			int status) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.version = version;
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", version=" + version
				+ ", status=" + status + "]";
	}
}
