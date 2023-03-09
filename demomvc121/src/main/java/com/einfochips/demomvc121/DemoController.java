package com.einfochips.demomvc121;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.demomvc121.jdbc.userjdbc;
import com.einfochips.demomvc121.model.user;

@RestController
public class DemoController {
	@Autowired
	userjdbc jd;
	

		@RequestMapping("home")
		public ModelAndView getHome() {
			return new ModelAndView("home");
		}
		
		@RequestMapping("Register")
		public ModelAndView getRegister() {
			return new ModelAndView("reg");
		}
		
		@RequestMapping("checkuser")
		public ModelAndView getcheck(@RequestParam("uname") String name) {
			System.out.println(name);
			return new ModelAndView("success");
		}
		@RequestMapping(value= "finduser", method = RequestMethod.POST)
		public ModelAndView getfinduser(@RequestParam("uname") String name) {
			List<u	 ser> u= jd.getAllUsers();
			System.out.println(u);
			System.out.println(name);
			return new ModelAndView("Success");
		}
		
		@RequestMapping("hello")
		public ModelAndView gethello() {
			return new ModelAndView("Hello");
		}
		
		@RequestMapping("picture")
		public ModelAndView getpicture() {
			return new ModelAndView("picture");
		}
		
		
}
