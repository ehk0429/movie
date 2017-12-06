package com.gmail.ehk0429.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateAdd {
	DateFormat df = new SimpleDateFormat("yyyyMMdd");
	
	public List<String> dateAdd() {
		List<String> list = new ArrayList<String>();
		try {
			// 기준날짜
			Date stDate = df.parse("20170102");
			Calendar cal = Calendar.getInstance();
			cal.setTime(stDate);
			//오늘 날짜
			Date currentDate = df.parse("20171206");
			Calendar cal2 = Calendar.getInstance();
			cal2.setTime(currentDate);
			while (!cal.after(cal2)){
				cal.add(Calendar.DATE, 7);
				list.add(df.format(cal.getTime()));
			}
		} catch (Exception e) {
			System.out.println("DateFormat 예외" + e.getMessage());
		}
		return list;
	}
		public String curdate(){
			String currentDate = null;
			try {
				Date date = new Date();
				currentDate = df.format(date);
				
			} catch (Exception e) {
				System.out.println("curdate 예외" + e.getMessage());
			}
			return currentDate;
		}
}
