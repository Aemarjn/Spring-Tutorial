package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("/")
	public ModelAndView getHome(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("home");
		
		return mv;
	}
	
	@PostMapping("register")
	//@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView saveForm(@RequestParam("name")String name,@RequestParam("email")String email){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("namekey",name);
		mv.addObject("emailkey", email);
		mv.setViewName("result");
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
