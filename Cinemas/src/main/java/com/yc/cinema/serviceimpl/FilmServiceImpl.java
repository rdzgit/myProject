package com.yc.cinema.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.mapper.FilminfoMapper;
import com.yc.cinema.service.FilmService;

@Service("filmService")
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilminfoMapper filminfoMapper;

	public List<Filminfo> getFilmByFilmBran(FilmBean filmBean) {
		return filminfoMapper.getFilmByFilmBran(filmBean);
	}

	public int add(Filminfo filmInfo) {
		return filminfoMapper.add(filmInfo);
	}

}
