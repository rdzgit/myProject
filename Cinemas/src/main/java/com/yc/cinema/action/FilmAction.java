package com.yc.cinema.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.serviceimpl.FilmServiceImpl;

@Controller("filmAction")
public class FilmAction implements ModelDriven<FilmBean>,SessionAware {
	private FilmBean filmBean;
	@Autowired
	private FilmService filmService;
	private Map<String, Object> session;

	public FilmBean getModel() {
		filmBean=new FilmBean();
		return filmBean;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	public String search(){
		List<Filminfo> films=filmService.getFilmByFilmBran(filmBean);
		session.put("films", films); 
		return "success";
	}
	
	public String add(){
		Filmtype type=new Filmtype(Integer.parseInt(filmBean.getTypeid()), "");
		Filminfo info=new Filminfo(0, filmBean.getFilmname(), type, filmBean.getActor(), filmBean.getDirector(), filmBean.getMinprice());
		int result=filmService.add(info);
		if(result>0){
			filmBean=null;
			return search();
		}
		return "failed";
	}
}
