package com.yc.cloud.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cloud.entity.Tag;
import com.yc.cloud.service.TagService;

@Controller("tagAction")
public class TagAction implements ModelDriven<Tag>{
	private Tag tag;
	private List<Tag> tags;
	@Autowired
	private TagService tagService;

	public List<Tag> getTags() {
		return tags;
	}
	public Tag getModel() {
		tag=new Tag();
		return tag;
	}
	
	public String getAllTags(){
		tags=tagService.getAllTag();
		return "success";
	}
}
