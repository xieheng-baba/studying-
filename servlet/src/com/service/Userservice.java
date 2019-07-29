package com.service;

import com.dao.UserDao;
import com.entity.User;

public class Userservice {
	public User find(String id) {
		UserDao dao =new UserDao();
		return dao.find(id);
	}
}
