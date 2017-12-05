package com.gmail.ehk0429.main;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import com.gmail.ehk0429.dao.MovieDao2;
import com.gmail.ehk0429.domain.MovieImg;

public class naverApi {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				String clientId = "ndRAcDJLYNprjCstmccJ";// 애플리케이션 클라이언트 아이디값";
				String clientSecret = "Ow7mzzxct0";// 애플리케이션 클라이언트 시크릿값";

				try {
					String apiURL = "https://openapi.naver.com/v1/search/movie.xml?query=";
					String apiURL2 = "&display=1"; // 1개만 출력되도록

					MovieDao2 dao = new MovieDao2(); // dao 객체선언
					List<String> movieNm = dao.getMovieNm();
					int size = movieNm.size();
					for (int i = 0; i < size; i++) {
						String movieNms = movieNm.get(i);
						// 영화이름 출력
						System.out.println(movieNms);
						if (size >= 0) {
							// text = 영화이름
							String text = URLEncoder.encode(movieNms, "UTF-8");
							// 영화이름 출력
							//URL 연결 
							URL url = new URL(apiURL + text + apiURL2);
							HttpURLConnection con = (HttpURLConnection) url.openConnection();
							con.setRequestMethod("GET");
							con.setRequestProperty("X-Naver-Client-Id", clientId);
							con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

							con.setConnectTimeout(30000);
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
							String xml = sb.toString();
							try {
								DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
								DocumentBuilder documentBuilder = factory.newDocumentBuilder();

								ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes());
								Document document = documentBuilder.parse(is);
								Element element = document.getDocumentElement();
								NodeList imageList = element.getElementsByTagName("image");

								// //영화 이름 <b>영화이름<b> 되어있어요 어떻게 해결할까요오오
								// NodeList title =
								// element.getElementsByTagName("title");
								//
								// for(int k = 0; k< title.getLength(); k++){
								// Node item = title.item(k);
								// if(item.getFirstChild() != null){
								// String tit =
								// item.getFirstChild().getNodeValue();
								// System.out.println(tit);
								// }
								// }
								MovieImg movieImg = new MovieImg();
								int length = imageList.getLength();
								for (int j = 0; j < length; j++) {

									Node item = imageList.item(j);

									if (item.getFirstChild() != null) {
										// xml element값 가져올 때
										String imgURL = item.getFirstChild().getNodeValue();

										movieImg.setImgUrl(imgURL);
										System.out.println(imgURL);
									}
								}
								// DB저장
								List<String> movieCd = dao.getMoiveCd();
								List<String> openDt = dao.getopenDt();
								String movieCds = movieCd.get(i);
								String openDts = openDt.get(i);
	//							System.out.println(movieCds);
								movieImg.setMovieCd(movieCds);
								movieImg.setOpenDt(openDts);
								int r = dao.insertImgUrl(movieImg);
								if (r > 0) {
									System.out.println("삽입성공");
								} else {
									System.out.println("삽입 실패");
								}
								// 전체 보기
								List<MovieImg> list = dao.getMovieImgList();
								for (MovieImg temp : list) {
									System.out.println(temp);
								}
							} catch (Exception e) {
								System.out.println("xmlparsing:" + e.getMessage());
							}
						}
					}
				} catch (Exception e) {
					System.out.println("예외 : " + e.getMessage());
				}
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		// 7일간격으로 시작딜레이 없이 시작하도록
		service.scheduleAtFixedRate(runnable, 0, 8, TimeUnit.DAYS);
	}
}
