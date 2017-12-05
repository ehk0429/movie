package com.gmail.ehk0429.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import com.gmail.ehk0429.dao.MovieDao2;
import com.gmail.ehk0429.domain.Movie;

//기준 날짜 부터 지정날짜까지 데이터 가져오는 클래스 (20170102~20171128)
//DateAdd 클래스 의 메소드 호출 dates.dateAdd()
public class KobisApI {
	public static void main(String[] args) {
		try {
			// 영화진흥위원회 오픈 api - json으로 가져오기
			String addr = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?";
			String key = "key=fc2b8f079568a0d2f63e7f78f4647545&";
			// date 옵션
			String date = "targetDt=";

			// 날짜별로 date에 들어가 수행함
			DateAdd dates = new DateAdd();
			// 기준날짜부터 지정날짜까지 데이터 가져오기
			List<String> dateList = dates.dateAdd();
			int size = dateList.size();
			for (int i = 0; i < size; i++) {
				String dateAdd = dateList.get(i);
				System.out.println(dateAdd);
				// “0” : 주간 (월~일)
				// System.out.println(addr + key + date + dateAdd +
				// "&0");
				URL url = new URL(addr + key + date + dateAdd + "&0");
				// 데이터 다운로드 connection 객체 생성
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				// 서버 연결 시간이 delay를 초과햇을 경우 예외발생
				con.setConnectTimeout(100000);
				con.setUseCaches(false);

				StringBuilder sb = new StringBuilder();
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				while (true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					sb.append(line + "\n");
				}
				String json = sb.toString();
				System.out.println(json);
				JSONObject object = new JSONObject(json);
				JSONObject boxOfficeResult = object.getJSONObject("boxOfficeResult");
				// System.out.println(boxOfficeResult);
				JSONArray weeklyBoxOfficeList = boxOfficeResult.getJSONArray("weeklyBoxOfficeList");
				// System.out.println(weeklyBoxOfficeList);

				Movie movie = new Movie();
				MovieDao2 dao = new MovieDao2();
				int length = weeklyBoxOfficeList.length();
				for (int k = 0; k < length; k++) {
					JSONObject item = weeklyBoxOfficeList.getJSONObject(k);

					movie.setMovieCd(item.getString("movieCd"));
					movie.setMovieNm(item.getString("movieNm"));
					movie.setOpenDt(item.getString("openDt"));
					movie.setAudiAcc(item.getString("audiAcc"));
					movie.setScrnCnt(item.getString("scrnCnt"));

					System.out.println(movie);
					int r = dao.insertMovie(movie);
					if (r > 0) {
						System.out.println("삽입성공");
					} else {
						System.out.println("삽입 실패");
					}
				}
				// 전체 보기
				List<Movie> list = dao.getMovieList();
				for (Movie temp : list) {
					System.out.println(temp);
				}
			}
		} catch (Exception e) {
			System.out.println("예외 :" + e.getMessage());
		}
	}
}
