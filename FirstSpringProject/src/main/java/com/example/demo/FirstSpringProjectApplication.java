package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.IHello;

@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner{
	
	@Autowired
	IHello bean;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		System.out.println(bean.getMessage(" From ENIS Engineer"));
		}

}
