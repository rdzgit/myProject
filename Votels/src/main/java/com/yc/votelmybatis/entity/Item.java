package com.yc.votelmybatis.entity;

/**
 * 用户选择的选项
 * @author Administrator
 *
 */
public class Item {
	private int id; //编号
	private Subject subject; //主题
	private Option option=new Option(); //选项
	private User user; //用户
	
	private int num; //主题下的人数

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	public String toString() {
		return "Item [id=" + id + ", subject=" + subject + ", option=" + option
				+ ", user=" + user + ", num=" + num + "]";
	}
}
