package com.einfochips.practicedatajpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class homecontroller {
	
	@RequestMapping("home")
	public ModelAndView gethome() {
		return new ModelAndView("home");
	}

}
