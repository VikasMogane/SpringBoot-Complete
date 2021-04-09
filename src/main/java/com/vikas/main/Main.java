package com.vikas.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication

@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class Main {
	
public static void main(String[] args) {
	

	ApplicationContext con =SpringApplication.run(Main.class, args);
	Person person =con.getBean(Person.class);
	person.eat();
	
	
//	ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
//	Person person = con.getBean(Person.class);
//	person.eat();
	
}

}
