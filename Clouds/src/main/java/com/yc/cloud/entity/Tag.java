package com.yc.cloud.entity;

public class Tag {
    private int tid; //主键,自增  编号
    private String tname; //不能为空  
    private int tcount; //不能为负 标签下所对应的网址信息
    
	public Tag() {
	}	public Tag(int tid, String tname, int tcount) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tcount = tcount;
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTcount() {
		return tcount;
	}
	public void setTcount(int tcount) {
		this.tcount = tcount;
	}
	public String toString() {
		return "CloudTag [tid=" + tid + ", tname=" + tname + ", tcount="
				+ tcount + "]";
	}
}
