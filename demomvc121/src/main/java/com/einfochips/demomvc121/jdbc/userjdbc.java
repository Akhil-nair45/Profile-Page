package com.einfochips.demomvc121.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfochips.demomvc121.model.user;

@Repository
public class userjdbc {

	public List<user>getAllUsers()
	{
		List<user> li = new ArrayList<user>();
		li.add(new user("abc@com","ABC","090897878","India"));
		return li;
	}
}
