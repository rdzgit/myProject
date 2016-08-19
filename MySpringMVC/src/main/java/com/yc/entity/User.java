package com.yc.entity;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -6180928559913664786L;
	
	private String uname;
	private String pwd;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + "]";
	}
}
