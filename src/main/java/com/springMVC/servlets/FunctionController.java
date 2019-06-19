package com.springMVC.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.services.AddService;
import com.springMVC.services.SubtractService;

@Controller
public class FunctionController {
	@RequestMapping("/add")
	// Getting Parameters using RequestParam
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		AddService addService = new AddService();
		int k = addService.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.addObject("int1", i);
		mv.addObject("int2", j);
		mv.addObject("result", k);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("/sub")
	// Getting Parameters using RequestParam
	public ModelAndView subtract(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		SubtractService subService = new SubtractService();
		int k = subService.sub(i, j);
		ModelAndView mv = new ModelAndView();
		mv.addObject("int1", i);
		mv.addObject("int2", j);
		mv.addObject("result", k);
		mv.setViewName("result");
		return mv;
	}
}	