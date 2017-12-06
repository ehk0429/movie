package com.gmail.ehk0429;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		model.addAttribute("msg", "success");
		return "/board/success";
	}
	@RequestMapping(value="/listAll",method = RequestMethod.GET)
	public void listAll(Model model)throws Exception{
		
		model.addAttribute("list", service.listAll());
		
	}
	@RequestMapping(value="/read",method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception{
		
		model.addAttribute("boardVO",service.read(bno));
	
	}
	  @RequestMapping(value = "/remove", method = RequestMethod.POST)
	  public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {

	    service.remove(bno);

	    rttr.addFlashAttribute("msg", "SUCCESS");

	    return "redirect:/board/listAll";
	  }
}
