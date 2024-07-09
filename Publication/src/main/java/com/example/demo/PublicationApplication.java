package com.example.demo;

import java.util.Date;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;

import lombok.AllArgsConstructor;


@SpringBootApplication
@AllArgsConstructor
@EnableDiscoveryClient
public class PublicationApplication implements CommandLineRunner {
	
	PublicationRepository publicationrepository;
    IPublicationService publicationservice;
    
   
	public static void main(String[] args) {
		SpringApplication.run(PublicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		Publication pub1 =Publication.builder()
				.date(new Date())
				.id(2L)
				.lien("lien1")
				.sourcepdf("sourcepdf1")
				.titre("Mon publication 1")
				.type("publication1")
				.build();
		
		Publication pub2 =Publication.builder()
				.date(new Date())
				.id(3L)
				.lien("lien2")
				.sourcepdf("sourcepdf2")
				.titre("Mon publication 2")
				.type("publication2")
				.build();
		
		publicationrepository.save(pub1);
		publicationrepository.save(pub2);
		
	
					Publication pub = publicationservice.findPublication(2L);
					pub.setLien("Lien 1");
					publicationservice.updatePublication(pub);
					
					/*publicationservice.deletePublication(2L);
					List<Publication> list =publicationservice.findPublicationByType("publication1");
					for (Publication element : list) {
					    System.out.println(element);
					}*/
		
	}

}
