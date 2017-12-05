package com.gmail.ehk0429;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gmail.ehk0429.domain.BoardVO;
import com.gmail.ehk0429.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/register" ,method=RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		logger.info("register get............");
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registPOST(BoardVO board, Model model)throws Exception{

		service.regist(board);
		model.addAttribute("result", "success");
		return "/board/success";
	}
}
