package com.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLogin;
import com.aartek.validator.LoginValidator;
import com.service.LoginService;


@Controller
public class LoginController {
		
		@Autowired
		private LoginService loginServ;
		
		@Autowired
		LoginValidator loginValidator;
		
		@RequestMapping(value="/login" , method=RequestMethod.GET)
		public String initUserLogin(Map<String, Object> map) {
			System.out.println("Login");
			map.put("UserLogin", new UserLogin());
			System.out.println("Userlogin instantiated");
			return "login";
		}
		
		@RequestMapping(value="/checkLogin", method=RequestMethod.POST)
		public String checkUserLogin(@ModelAttribute("UserLogin") UserLogin usr,BindingResult errors) {
			loginValidator.validate(usr, errors);
			if(errors.hasErrors())
				return "login";
			String result =loginServ.checkLoginService(usr);
			System.out.println(result);
			return "welcome";
		}
	}
