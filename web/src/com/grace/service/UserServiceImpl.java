package com.grace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grace.dao.UserDao;
import com.grace.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao dao;
	@Override
	public List<User> select() {
		return dao.select();
	}

}
