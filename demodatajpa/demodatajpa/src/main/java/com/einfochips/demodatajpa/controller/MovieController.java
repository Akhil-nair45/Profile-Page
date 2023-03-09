package com.einfochips.demodatajpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.demodatajpa.dao.MovieDao;
import com.einfochips.demodatajpa.model.movie;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MovieController {
	
	@Autowired
	MovieDao md;

		@RequestMapping("home")
		public ModelAndView getHome() {
			return new ModelAndView("home");
		}
		
		@RequestMapping("addmovie")
		public ModelAndView getaddmovie() {
			return new ModelAndView("addmovie");
		}
		
		@RequestMapping(value="insertmovie",method=RequestMethod.POST)
		public ModelAndView insertMovie(HttpServletRequest req, @RequestParam("mname")String movieName, @RequestParam("lang") String language) {
//		int movieId=Integer.parseInt(req.getParameter("mid"));
		String movieName1=req.getParameter("mname");
		String language1=req.getParameter("lang");
		movie m = new movie(0,movieName1,language1,req.getParameter("director"));
		
		//use DAO class
		//userDao ud= new UserDao();
		//ud.insertUser(u)
		md.save(m);
		System.out.println(m);		
		
		return new ModelAndView("success");
}
		
		@RequestMapping("viewmovies")
		public ModelAndView viewAllMovies() {
			ModelAndView mv = new ModelAndView("viewallmovies");
			List<movie> li= md.findAll();
			mv.addObject("movies",li);
			return mv;
			}
}