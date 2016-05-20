package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;

public interface FilmService {
	/**
	 * 根据所给的参数找到电影信息
	 * @param filmBean
	 * @return
	 */
	public List<Filminfo> getFilmByFilmBran(FilmBean filmBean);
	
	/**
	 * 添加电影信息
	 * @param filmInfo
	 * @return
	 */
	public int add(Filminfo filmInfo);
}
