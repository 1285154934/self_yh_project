package com.yh.manager.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
	@RequestMapping("/home")
	public String home(){
		return "蛋蛋 睡不着吧，起来嗨啊，哈哈哈哈";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
