package com.maxrumo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${job}")
	String job;
	@Value("${hobby}")
	String hobby;
	@Value("${name}")
	String name;


	@RequestMapping("hi")
	public String hi(){
		return String.format("hi! %s , hobby is %s, job is %s",name,hobby,job);
	}
}
