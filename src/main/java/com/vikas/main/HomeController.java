package com.vikas.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String  home()
	{
		return "home Vikas";
	}

	@RequestMapping("/about")
	public String about()
	{
		return "about vikas";
	}
}
