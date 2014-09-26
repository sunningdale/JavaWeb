package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("/login/index.html")
public class LoginController {
	
	@RequestMapping(value="index.do")
	public ModelAndView doGet(HttpServletRequest request, HttpServletResponse reponse){
		
		System.out.println("-------------------login---------------");
		
		return new ModelAndView("/login/index");
	}

}
