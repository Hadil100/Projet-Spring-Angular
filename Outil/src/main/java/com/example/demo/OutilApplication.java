package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;
import com.example.demo.service.IOutilService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@EnableDiscoveryClient
@SpringBootApplication
public class OutilApplication implements CommandLineRunner{
	
	@Autowired
	OutilRepository outilrepository;
    IOutilService outilservice;
    
	public static void main(String[] args) {
		SpringApplication.run(OutilApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
        Outil out1 = Outil.builder()
                .date(new Date())
                .source("Source 1")
                .build();

        Outil out2 = Outil.builder()
                .date(new Date())
                .source("Source 2")
                .build();

        outilrepository.save(out1);
        outilrepository.save(out2);
    }

}
