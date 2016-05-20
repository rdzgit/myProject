package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;

public interface FilmService {
	/**
	 * ���������Ĳ����ҵ���Ӱ��Ϣ
	 * @param filmBean
	 * @return
	 */
	public List<Filminfo> getFilmByFilmBran(FilmBean filmBean);
	
	/**
	 * ��ӵ�Ӱ��Ϣ
	 * @param filmInfo
	 * @return
	 */
	public int add(Filminfo filmInfo);
}
