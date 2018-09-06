package com.sowmya.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController 
{
	@RequestMapping("/home")
	public ModelAndView m1()
	{
		ModelAndView mv1=new ModelAndView("pro1","v1",100);
		return mv1;
	}
	@RequestMapping("/home1")
	public ModelAndView m2()
	{
		ModelAndView mv2=new ModelAndView("pro2");
		return mv2;
	}

}
