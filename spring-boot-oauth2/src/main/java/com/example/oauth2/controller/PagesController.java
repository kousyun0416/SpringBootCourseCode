package com.example.oauth2.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagesController {
	@RequestMapping("/index")
	public ModelAndView index(Authentication authentication) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("authInfo", authentication);
		mv.setViewName("/index");
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "/login";
	}
	
	@RequestMapping("/admin/hello")
	public ModelAndView adminHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", "admin");
		mv.setViewName("/admin/hello");
		return mv;
	}

	@RequestMapping("/user/hello")
	public ModelAndView userHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", "kevin");
		mv.setViewName("/user/hello");
		return mv;
	}
	
	@RequestMapping("/other/hello")
	public ModelAndView otherHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", "other");
		mv.setViewName("/other/hello");
		return mv;
	}
}
