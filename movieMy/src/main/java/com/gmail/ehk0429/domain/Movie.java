package com.gmail.ehk0429.domain;

public class Movie {
	
//영화코드movieCd
//영화명 movieNm
//개봉일 openDt
//누적관객수audiAcc
//스크린수 scrnCnt
	private String movieCd;
	private String movieNm;
	private String openDt;
	private String audiAcc;
	private String scrnCnt;

	public String getMovieCd() {
		return movieCd;
	}
	public void setMovieCd(String movieCd) {
		this.movieCd = movieCd;
	}
	public String getMovieNm() {
		return movieNm;
	}
	public void setMovieNm(String movieNm) {
		this.movieNm = movieNm;
	}
	public String getOpenDt() {
		return openDt;
	}
	public void setOpenDt(String openDt) {
		this.openDt = openDt;
	}
	public String getAudiAcc() {
		return audiAcc;
	}
	public void setAudiAcc(String audiAcc) {
		this.audiAcc = audiAcc;
	}
	public String getScrnCnt() {
		return scrnCnt;
	}
	public void setScrnCnt(String scrnCnt) {
		this.scrnCnt = scrnCnt;
	}
	@Override
	public String toString() {
		return "Movie [movieCd=" + movieCd + ", movieNm=" + movieNm + ", openDt=" + openDt + ", audiAcc=" + audiAcc
				+ ", scrnCnt=" + scrnCnt + "]";
	}
	
}
