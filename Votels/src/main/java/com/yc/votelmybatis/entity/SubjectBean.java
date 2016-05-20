package com.yc.votelmybatis.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 投票主题Bean类
 * @author Administrator
 *
 */
public class SubjectBean implements Serializable{
	private static final long serialVersionUID = 9219754257394717824L;
	
	private int id=-1; //编号
	private String title; //标题
	private int type=1; //类型
	private int version=1; //是否有效
	private List<Option> options=new ArrayList<Option>(); //选项的集合
	private List<User> users=new ArrayList<User>(); //参与投票的用户
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public void setOption(List<String> options) {
		for (int i=0;i<options.size();i++) {
			this.options.add(new Option(options.get(i),i));
		}
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public int getUsersSize(){
		return users.size();
	}
	public int getOptionsSize(){
		return options.size();
	}
	
	public void setOptionSubject(int id){
		Subject s=new Subject();
		s.setId(id);
		for (Option o : options) {
			o.setSubject(s);
		}
	}
	public String toString() {
		return "SubjectBean [id=" + id + ", title=" + title + ", type=" + type
				+ ", version=" + version + ", options=" + options + ", users="
				+ users + "]";
	}
}
