package com.gmail.ehk0429;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gmail.ehk0429.service.MovieService;

@Controller
public class MemberController {

	
	@Autowired
	private MovieService movieService;
	
	//요청주소
			@RequestMapping("hello.do")
			public ModelAndView hello(){
				//modelandview 컨트롤러가 처리한 결과 정보를 저장하고 뷰 선택에 대한 정보를 저장
				ModelAndView mav = new ModelAndView();
				
				//출력할 뷰 이름 설정
				mav.setViewName("hello");
				mav.addObject("인사", "insa");
				return mav;
			}
}
