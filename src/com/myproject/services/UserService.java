package com.myproject.services;

import com.myproject.commons.ServiceBase;
import com.myproject.database.mappers.interfaces.UserMapper;
import com.myproject.entities.User;

public class UserService extends ServiceBase{
	
	private UserMapper service;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		super();
		service = session.getMapper(UserMapper.class);
	}

	public void Insert(User user) {
		try {
			service.Insert(user);
		} catch (Exception e) {
			Rollback();
			throw e;
		}
	}
}
