package com.yc.cloud.entity;

import java.util.ArrayList;
import java.util.List;

public class Favorite {
    private int fid; //主键,自增	网址编号
    private String flabel; //不能为空	
    private String furl; //不能为空	地址
    private List<Tag> tags=new ArrayList<Tag>(); //分类标签
    private String fdesc; //描述
    
    private String ftags;
    
	public String getFtags() {
		return ftags;
	}
	public void setFtags(String ftags) {
		this.ftags = ftags;
	}
	
	public Favorite() {

	}
	public Favorite(int fid, String flabel, String furl, List<Tag> tags,String fdesc) {
		super();
		this.fid = fid;
		this.flabel = flabel;
		this.furl = furl;
		this.tags = tags;
		this.fdesc = fdesc;
	}
	public String getTags() {
		String ftags = "";
		if(tags!=null){
			for (Tag t : tags) {
				ftags+=t.getTname();
			}
		}
		return ftags;
	}
	public List<Tag> getTagsList() {
		return tags;
	}
	public void setTags(String tags) {
		if(tags.length()>0 && !"".equals(tags)){
			String[] strs=tags.split(",");
			for (String s : strs) {
				this.tags.add(new Tag(0,s,0));
			}
		}else{
			this.tags=null;
		}
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFlabel() {
		return flabel;
	}
	public void setFlabel(String flabel) {
		this.flabel = flabel;
	}
	public String getFurl() {
		return furl;
	}
	public void setFurl(String furl) {
		this.furl = furl;
	}
	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}
	public String toString() {
		return "CloudFavorite [fid=" + fid + ", flabel=" + flabel + ", furl="
				+ furl + ", tags=" + tags + ", fdesc=" + fdesc + "]";
	}
}
