package com.sample.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.dao.DAO;
import com.sample.model.Person;

@Controller
public class MainController {

	@Autowired
	DAO dao;
	
	@GetMapping("/")
	public ModelAndView getHome(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("person", new Person());
		return mv;
	}
	
	@PostMapping("save")
	public ModelAndView save(@Valid @ModelAttribute("person") Person person, BindingResult result){
		ModelAndView mv = new ModelAndView();
		//System.out.print(result.hasErrors());
		if(result.hasErrors()){
			mv.setViewName("home");
			return mv;
		}
//		mv.addObject("name", name);
//		mv.addObject("age", age);
		dao.save(person);
		mv.addObject("person", person);
		mv.setViewName("result");
		return mv;
	}
	
}
