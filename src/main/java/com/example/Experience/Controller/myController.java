package com.example.Experience.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Experience.dao.UserDatarepo;
import com.example.Experience.model.UserData;


@Controller
public class myController {
	
	@Autowired
	UserDatarepo repo;
	
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/registration")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping("/submission")
	public String submission(UserData userdata)
	{
		repo.save(userdata);
		return "succesfull";
	}
	
	@RequestMapping("/log")
	public String login()
	{
		return "login";
	}
	
	
}