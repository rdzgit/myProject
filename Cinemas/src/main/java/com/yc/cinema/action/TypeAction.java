package com.yc.cinema.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.service.TypeService;

@Controller("typeAction")
public class TypeAction{
	@Autowired
	private TypeService typeService;
	private List<Filmtype> fileTypes; 
	
	public List<Filmtype> getFileTypes() {
		return fileTypes;
	}
	public void setFileTypes(List<Filmtype> fileTypes) {
		this.fileTypes = fileTypes;
	}

	public String getTypes(){
		fileTypes=typeService.findAllTypes();
		return "success";
	}
}
