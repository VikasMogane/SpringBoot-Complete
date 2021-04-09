package com.vikas.main;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	@Autowired
	Food food;
	
	public void speak()
	{
		System.out.println("he can able to speak");
	}
	
	public void eat()
	{
		food.receipe();
	}

}
