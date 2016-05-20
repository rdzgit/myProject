package com.yc.cinema.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.mapper.FilmtypeMapper;
import com.yc.cinema.service.TypeService;

@Service("typeService")
public class TypeServiceImpl implements TypeService {
	@Autowired
	private FilmtypeMapper filmtypeMapper;
	
	public List<Filmtype> findAllTypes() {
		return filmtypeMapper.findAllTypes();
	}
}
