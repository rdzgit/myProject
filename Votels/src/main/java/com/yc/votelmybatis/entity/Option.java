package com.yc.votelmybatis.entity;

import java.io.Serializable;

/**
 * 主题下的选项
 * @author Administrator
 *
 */
public class Option implements Serializable{
	private static final long serialVersionUID = 3480497921169094614L;
	
	private int id; //编号
	private String name; //选项名 如：北京
	private int optionOrder; //显示顺序
	private Subject subject; //对应的主题	如：中国的首都是？
	
	public Option() {
	}
	public Option(String name,int optionOrder) {
		this.name = name;
		this.optionOrder=optionOrder;
	}
	public Option(String name,int optionOrder,int subjectId) {
		Subject s=new Subject();
		
		this.name = name;
		this.optionOrder=optionOrder;
		
		s.setId(subjectId);
		this.subject=s;
		
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
	public String toString() {
		return "Option [id=" + id + ", name=" + name + ", optionOrder="
				+ optionOrder + ", subject=" + subject + "]";
	}
}
