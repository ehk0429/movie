package com.gmail.ehk0429.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.ehk0429.dao.MovieDao;
import com.gmail.ehk0429.domain.Movie;
import com.gmail.ehk0429.domain.MovieImg;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao dao;
	
	@Override
	public List<Movie> getMovieList() {
		return dao.getMovieList();
	}

	@Override
	public int insertMovie(Movie movie) {
		return dao.insertMovie(movie);
	}

	@Override
	public List<String> getMovieNm() {
		return dao.getMovieNm();
	}

	@Override
	public List<String> getMoiveCd() {
		return dao.getMoiveCd();
	}

	@Override
	public int insertImgUrl(MovieImg movieImg) {
		return dao.insertImgUrl(movieImg);
	}

	@Override
	public List<MovieImg> getMovieImgList() {
		return dao.getMovieImgList();
	}


}
