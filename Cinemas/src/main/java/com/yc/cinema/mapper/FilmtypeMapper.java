package com.yc.cinema.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.cinema.entity.Filmtype;

@Repository("filmtypeMapper")
public interface FilmtypeMapper {
	/**
	 * �ҵ����е�����
	 * @return
	 */
    public List<Filmtype> findAllTypes();
}