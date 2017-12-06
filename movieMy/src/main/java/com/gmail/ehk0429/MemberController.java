package com.gmail.ehk0429;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gmail.ehk0429.domain.BoardVO;
import com.gmail.ehk0429.domain.MemberVO;
import com.gmail.ehk0429.domain.Movie;
import com.gmail.ehk0429.service.MemberService;
import com.gmail.ehk0429.service.MovieService;

@Controller
public class MemberController {

	
	@Autowired
	private	MemberService service;
	
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
			@RequestMapping("signup.do")
			public String signup(Model model){
								
				model.addAttribute("signup","singup");
				return "signup";
				
			}
}
