package com.yc.votelmybatis.entity;

import java.util.List;

/**
 * 用户选择的选项
 * @author Administrator
 *
 */
public class ItemBean {
	private int id; //编号
	private int sid; //主题
	private List<Integer> oid; //选项
	private int uid; //用户
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public List<Integer> getOid() {
		return oid;
	}
	public void setOid(List<Integer> oid) {
		System.out.println(oid);
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String toString() {
		return "ItemBean [id=" + id + ", sid=" + sid + ", oid=" + oid
				+ ", uid=" + uid + "]";
	}
}
