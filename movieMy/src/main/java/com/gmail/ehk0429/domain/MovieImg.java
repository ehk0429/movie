package com.gmail.ehk0429.domain;

public class MovieImg {
	private String movieCd;
	private String imgUrl;
	private String openDt;

	public String getOpenDt() {
		return openDt;
	}
	public void setOpenDt(String openDt) {
		this.openDt = openDt;
	}
	public String getMovieCd() {
		return movieCd;
	}
	public void setMovieCd(String movieCd) {
		this.movieCd = movieCd;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "MovieImg [movieCd=" + movieCd + ", imgUrl=" + imgUrl + ", openDt=" + openDt + "]";
	}
}
