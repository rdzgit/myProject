package com.yc.votelmybatis.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 投票主题类
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
public class Subject {
	private static int TYPE_SINGLE=1; //单选
	private static int TYPE_MULTIPLE=2; //复选

	private int id=-1; //编号
	private String title; //标题
	private int type=1; //类型
	private int version=1; //是否有效
	
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
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + ", type=" + type
				+ ", version=" + version + "]";
	}
}
