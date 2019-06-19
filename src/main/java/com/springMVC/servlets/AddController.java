package com.springMVC.servlets;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.services.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")

	// Getting Parameters using RequestParam
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {

		  username = ((UserDetails)principal).getUsername();

		} else {

		  username = principal.toString();

		}
		AddService addService = new AddService();
		int k = addService.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", k);
		mv.addObject("name", username);
		mv.setViewName("result");
		return mv;
	}
}
