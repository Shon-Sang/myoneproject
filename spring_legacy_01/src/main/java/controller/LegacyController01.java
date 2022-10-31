package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.LegacyService01;

@Controller
public class LegacyController01 {

	private LegacyService01 legacyService01;
	public LegacyController01() {
		
	}
	
	public LegacyController01(LegacyService01 legacyService01) {
		this.legacyService01 = legacyService01;
	}
	
	@RequestMapping("main")
	public String prac01() {
		return "home";
	}
	
	@RequestMapping("board/data")
	public ModelAndView prac02(ModelAndView mav) {
		System.out.println(legacyService01.getData());
		mav.addObject("board_data_01", legacyService01.getData());
		mav.setViewName("board_data");
		return mav;
	}
}
