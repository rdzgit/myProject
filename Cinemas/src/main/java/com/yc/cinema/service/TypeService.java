package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.Filmtype;

public interface TypeService {
	/**
	 * ��ȡ���е�����
	 * @return
	 */
	public List<Filmtype> findAllTypes();
}
