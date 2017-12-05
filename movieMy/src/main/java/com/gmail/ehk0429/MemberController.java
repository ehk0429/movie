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
				//전달될 데이터 저장 -request에 저장됨
				//속성이름 , 데이터 최종view에서 불러올때 사용
				mav.addObject("insa","안녕하세요");
				
				return mav;
			}
}
