package com.example.Experience.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.Experience.dao.CompanyDatadao;
import com.example.Experience.dao.UserDatarepo;
import com.example.Experience.model.CompanyData;
import com.example.Experience.model.UserData;


@Controller
public class myController {
	
	@Autowired
	UserDatarepo repo;
	
	@Autowired
	CompanyDatadao re;
	
	
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
	
	@RequestMapping("/sub")
	public String sub(CompanyData companydata)
	{
		
		return "login";
	}
	

	@RequestMapping("/log")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/inter")
	public String inter()
	{
		return "interview";
		
	}

	
		
	
//	 @GetMapping("/company/{id}")
//	    public Optional<CompanyData> getCompanyById(
//	        @PathVariable(value = "id") int id)
//	    {
//	        return re.findById(id);
//	    }
	 
	 
	@RequestMapping("/show")
		public ModelAndView show()
		{
			ModelAndView mv = new ModelAndView();
			List<UserData> data = repo.findAll();
			mv.addObject("data", data);
			mv.setViewName("view");	
			return mv;
		}
	
	 @RequestMapping("/showData")
	public ModelAndView showData()
	{
		ModelAndView mv = new ModelAndView();
		List<CompanyData> datalist = re.findAll();
		mv.addObject("data", datalist);
		mv.setViewName("companyview");	
		return mv;
	
	}
}