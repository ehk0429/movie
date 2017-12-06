package com.gmail.ehk0429.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gmail.ehk0429.domain.Movie;
import com.gmail.ehk0429.domain.MovieImg;

@Repository
public class MovieDaoImpl implements MovieDao {

	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.gmail.ehk0429.mappers.movieMapper";
	@Override
	public List<Movie> getMovieList() {
		
		return sqlSession.selectList(namespace+".getMovieList");
	}

	@Override
	public int insertMovie(Movie movie) {
		return sqlSession.insert(namespace+".insertMovie",movie);
	}

	@Override
	public List<String> getMovieNm() {
		return sqlSession.selectList(namespace+".getMovieNm");
	}

	@Override
	public List<String> getMoiveCd() {
		return sqlSession.selectList(namespace+".getMovieCd");
	}

	@Override
	public int insertImgUrl(MovieImg movieImg) {
		return sqlSession.insert(namespace+".insertImgUrl",movieImg);
	}

	@Override
	public List<MovieImg> getMovieImgList() {
		return sqlSession.selectList(namespace+".getMovieImgList");
	}

	@Override
	public Movie readMovie(String movieCd) {
		return sqlSession.selectOne(namespace + ".readMovie",movieCd);
		
	}



}
