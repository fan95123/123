package com.grace.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grace.entity.User;
import com.grace.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	@RequestMapping("index")
	public String select(Map<String, List<User>> map) {
		List<User> list = service.select();
		map.put("user", list);
		return null;
	}
}
