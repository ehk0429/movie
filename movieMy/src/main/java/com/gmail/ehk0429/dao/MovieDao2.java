package com.gmail.ehk0429.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gmail.ehk0429.domain.Movie;
import com.gmail.ehk0429.domain.MovieImg;

public class MovieDao2 {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public MovieDao2(){
		//오라클 연동 드라이버 클래스를 메모리에 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("MovieDao 생성자 예외 :"+ e.getMessage());
		}
	}
	// 이클래스를 바로 사용할 수 있도록 해주는 설정
	private void connect(){
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new?useSSL=false","root","0000");
			
		} catch (Exception e) {
			System.out.println("connect 예외" + e.getMessage());
		}
	}
	private void close(){
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(con != null)con.close();
		} catch (Exception e) {
			System.out.println("close :" +e.getMessage());
		}
	}
	public int insertMovie(Movie movie){
		int result = -1;
		connect();
		try {
			//sql 실행 객체 만들기 
			pstmt = con.prepareStatement("insert into movie(movieCd, movieNm, openDt, audiAcc, scrnCnt) values(?,?,?,?,?)");
			
			pstmt.setString(1, movie.getMovieCd());
			pstmt.setString(2, movie.getMovieNm());
			pstmt.setString(3, movie.getOpenDt());
			pstmt.setString(4, movie.getAudiAcc());
			pstmt.setString(5, movie.getScrnCnt());
			//Sql 실행
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("데이터삽입실패:"+e.getMessage());
		}
		close();
		return result;
	}
	public List<Movie> getMovieList(){
		List<Movie> list = new ArrayList<Movie>();
		try {
			connect();
			//sql 실행 객체 만들기 
			pstmt = con.prepareStatement("select movieCd, movieNm, openDt, audiAcc, scrnCnt from movie order by openDt DESC");
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				Movie movie = new Movie();
				movie.setMovieCd(rs.getString("movieCd"));
				movie.setMovieNm(rs.getString("movieNm"));
				movie.setOpenDt(rs.getString("openDt"));
				movie.setAudiAcc(rs.getString("audiAcc"));
				movie.setScrnCnt(rs.getString("scrnCnt"));
				
				list.add(movie);
			}
					
		} catch (Exception e) {
			System.out.println("전체 데이터 리턴 실패"+ e.getMessage());
		}
		close();
		return list;
	
	}
	public List<String> getMovieNm(){
		List<String> list = new ArrayList<String>();
		connect();
		try {
			
			pstmt = con.prepareStatement("select movieNm from movie");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
		
				Movie movie = new Movie();
				movie.setMovieNm(rs.getString("movieNm"));
				
				list.add(rs.getString(1));
			}
			
		} catch (Exception e) {
			System.out.println("영화이름 리턴 실패"+ e.getMessage());
		}
		
		close();
		return list;
		
	}
	public int insertImgUrl(MovieImg movieImg){
		int result = -1;
		connect();
		try {
			pstmt = con.prepareStatement("insert into movieimg(movieCd, imgURL, openDt) values(?,?,?)");
			
			pstmt.setString(1, movieImg.getMovieCd());
			pstmt.setString(2, movieImg.getImgUrl());
			pstmt.setString(3, movieImg.getOpenDt());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("데이터삽입 실패:"+e.getMessage());
		}
		close();
		return result;
	}
	public List<String> getMoiveCd(){
		List<String> list = new ArrayList<String>();
		connect();
		try {
			pstmt = con.prepareStatement("select movieCd from movie");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Movie movie = new Movie();
				movie.setMovieCd(rs.getString("movieCd"));
			
				list.add(rs.getString(1));
				
			}
		} catch (Exception e) {
			System.out.println("영화코드 리턴 실패" + e.getMessage());
		}
		close();
		
		return list;
	}
	public List<String> getopenDt(){
		List<String> list = new ArrayList<String>();
		connect();
		try {
			pstmt = con.prepareStatement("select openDt from movie");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Movie movie = new Movie();
				movie.setMovieCd(rs.getString("openDt"));
			
				list.add(rs.getString(1));
				
			}
		} catch (Exception e) {
			System.out.println("개봉일 리턴 실패" + e.getMessage());
		}
		close();
		
		return list;
	}
	public List<MovieImg> getMovieImgList(){
		List<MovieImg>list = new ArrayList<MovieImg>();
		try {
			connect();
			pstmt = con.prepareStatement("select movieCd, imgUrl, openDt from movieimg order by openDt DESC");
			rs = pstmt.executeQuery();
			while(rs.next()){
				MovieImg movieImg = new MovieImg();
				movieImg.setMovieCd(rs.getString("movieCd"));
				movieImg.setImgUrl(rs.getString("imgURL"));
				movieImg.setOpenDt(rs.getString("openDt"));
			}
			
			
		} catch (Exception e) {
			System.out.println("movieImgList 리턴실패 " + e.getMessage());
		}
			
		close();
		return list;
	}
}