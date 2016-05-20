package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.Filmtype;

public interface TypeService {
	/**
	 * 获取所有的类型
	 * @return
	 */
	public List<Filmtype> findAllTypes();
}
