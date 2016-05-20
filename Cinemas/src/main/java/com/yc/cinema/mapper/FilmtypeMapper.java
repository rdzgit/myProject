package com.yc.cinema.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.cinema.entity.Filmtype;

@Repository("filmtypeMapper")
public interface FilmtypeMapper {
	/**
	 * 找到所有的类型
	 * @return
	 */
    public List<Filmtype> findAllTypes();
}