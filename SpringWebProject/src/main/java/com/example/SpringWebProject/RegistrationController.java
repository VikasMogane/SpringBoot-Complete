package com.example.SpringWebProject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

	@RequestMapping("/regForm")
	public String register()
	{
		return "registration";
	} 
	
	@RequestMapping("/userDetails")
	public String userInfo()
	{
		System.out.println("I m detail..");
		return "userDetails";
	}
}
