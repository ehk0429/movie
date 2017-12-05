package com.gmail.ehk0429.service;

import java.util.List;

import com.gmail.ehk0429.domain.Movie;
import com.gmail.ehk0429.domain.MovieImg;

public interface MovieService {
	
	// Movie테이블의 전체데이터 리턴 메소드
		public List<Movie> getMovieList();

		// Movie 테이블에 데이터  삽입 메소드
		public int insertMovie(Movie movie);

		// Movie테이블에서 MovieNm 만 리턴 메소드
		public List<String> getMovieNm();

		// Movie테이블에서 MovieCd 만 리턴 메소드
		public List<String> getMoiveCd();

		// MovieImg 테이블에서 ImgUrl 만 삽입 메소드
		public int insertImgUrl(MovieImg movieImg);
		// MovieImg 테이블의 전체 데이터 리턴 메소드
		public List<MovieImg> getMovieImgList();
		

}
