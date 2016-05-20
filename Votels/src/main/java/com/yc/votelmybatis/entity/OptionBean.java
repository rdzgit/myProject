package com.yc.votelmybatis.entity;

import java.io.Serializable;

/**
 * 主题下Bean的选项
 * @author Administrator
 *
 */
public class OptionBean implements Serializable{
	private static final long serialVersionUID = -4233567968751244251L;
	
	private int id; //编号
	private String name; //选项名 如：北京
	private int optionOrder; //显示顺序
	private Subject subject; //对应的主题	如：中国的首都是？
	
	private int num; //主题下的选项数
	private int oUserNum; //该选项选的人数
	
	public OptionBean(){
		
	}
	public OptionBean(String name,int optionOrder) {
		this.name = name;
		this.optionOrder=optionOrder;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOptionOrder() {
		return optionOrder;
	}
	public void setOptionOrder(int optionOrder) {
		this.optionOrder = optionOrder;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getoUserNum() {
		return oUserNum;
	}
	public void setoUserNum(int oUserNum) {
		this.oUserNum = oUserNum;
	}
	public String toString() {
		return "Option [id=" + id + ", name=" + name + ", optionOrder="
				+ optionOrder + ", subject=" + subject + ", num=" + num
				+ ", oUserNum=" + oUserNum + "]";
	}
}
