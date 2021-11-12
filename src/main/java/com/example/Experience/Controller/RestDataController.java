package com.example.Experience.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Experience.model.UserData;
import com.example.Experience.dao.UserDatarepo;

@RestController
public class RestDataController {
	
	@Autowired
	UserDatarepo repo;
	
	@RequestMapping("/viewData")
	public List<UserData> viewData(){
		return repo.findAll();
	}
	
	
}
