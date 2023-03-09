package com.einfochips.demodatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfochips.demodatajpa.model.movie;

@Repository
public interface MovieDao extends JpaRepository<movie,Integer> {

}
