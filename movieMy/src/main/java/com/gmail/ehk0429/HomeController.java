package com.gmail.ehk0429;

import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gmail.ehk0429.domain.Movie;
import com.gmail.ehk0429.domain.MovieImg;
import com.gmail.ehk0429.service.MovieService;

@Controller
public class HomeController {
	

	@Autowired
	private MovieService movieService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<MovieImg> movieImg = movieService.getMovieImgList();
		model.addAttribute("movieImg", movieImg);
		return "home";
	}
	
	@RequestMapping("movielist.do")
	public String moivelist(Model model){
		
		List<Movie> movielist = movieService.getMovieList();
		model.addAttribute("movielist",movielist);
		return "movielist";
		
	}
	
	@RequestMapping(value="readMovie.do", method= RequestMethod.GET)
	public void readMovie(@RequestParam("movieCd") String movieCd, Model model ) throws Exception{
		
		
		model.addAttribute( "readMovie",movieService.readMovie(movieCd));
		
	}
}
