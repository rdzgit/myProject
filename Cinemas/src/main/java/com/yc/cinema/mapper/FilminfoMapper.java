package com.yc.cinema.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;

@Repository("filminfoMapper")
public interface FilminfoMapper {
	/**
	 * 根据条件查询电影信息
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