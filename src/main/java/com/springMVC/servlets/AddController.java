package com.springMVC.servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.services.AddService;
import com.springMVC.services.Login;

@Controller
public class AddController {
	@RequestMapping("/add")
	// Getting Parameters using HttpServletRequest and HttpServletReponse
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		Login login = new Login();
		String email = request.getParameter("t1");
		String password = request.getParameter("t2");
		boolean loggedIn = login.LoginCredentials(email, password);
/*		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		AddService addService = new AddService();
		int k = addService.add(i, j);
		System.out.println("I am in AddController " + i + j + k);
*/		ServletContext ctx = request.getServletContext();
		String name = ctx.getInitParameter("name");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		if(loggedIn)
			mv.addObject("name", name);
		else
			mv.addObject("msg", "Login Failed");
	return mv;
}
/*	// Getting Parameters using RequestParam
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		System.out.println("I am in AddController " + i + j);
		Login login = new Login();
		login.LoginCredentials();
				
		AddService addService = new AddService();
		int k = addService.add(i, j);
		System.out.println("I am in AddController " + i + j + k);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", k);
		
		

		return mv;
	}
	*/
}
