package com.yc.cinema.entity;

public class Filmtype {
    private Integer typeid;

    private String typename;

    public Filmtype() {
		super();
	}
	public Filmtype(Integer typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}

	public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

	public String toString() {
		return "Filmtype [typeid=" + typeid + ", typename=" + typename + "]";
	}
}