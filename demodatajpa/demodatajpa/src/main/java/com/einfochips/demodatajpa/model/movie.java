package com.einfochips.demodatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class movie {
	@Id
	@GeneratedValue
	private int movieId;
	private String movieName;
	private String language;
	private String director;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", director="
				+ director + "]";
	}
	public movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public movie(int movieId, String movieName, String language, String director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.director = director;
	}
	
	
	
	

}
