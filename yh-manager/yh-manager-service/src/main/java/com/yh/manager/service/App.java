package com.yh.manager.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App 
{
	@GetMapping("/")
	@ResponseBody
	public String home(){
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
