package com.yc.cinema.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;

@Repository("filminfoMapper")
public interface FilminfoMapper {
	/**
	 * ����������ѯ��Ӱ��Ϣ
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