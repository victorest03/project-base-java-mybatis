package com.myproject.controllers;

import com.myproject.services.UserService;

public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
		try(UserService userServices = new UserService()){
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
