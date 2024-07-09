package com.example.demo.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.dao.PublicationRepository;

import com.example.demo.entities.Publication;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PublicationImp implements IPublicationService {
	
	PublicationRepository publicationRepository;
	
	
	public Publication addPublication(Publication p) {
		
		publicationRepository.save(p);
		return p;
	}
	public void deletePublication(Long id) {
		publicationRepository.deleteById(id);
	}
	public Publication updatePublication(Publication p) {
		return publicationRepository.saveAndFlush(p);
		
	}
	public Publication findPublication(Long id) {
		return publicationRepository.findById(id).get();
	}
	public List<Publication> findAll(){
		return publicationRepository.findAll();
	}
	public Publication findPublicationByTitre(String titre) {
		return publicationRepository.findByTitre(titre);
	}
	public List<Publication> findPublicationByType(String type) {
		return publicationRepository.findByType(type);
	}
	public Publication findPublicationByLien(String lien) {
		return publicationRepository.findByLien(lien);
	}
	public List<Publication> findPublicationByDate(Date date) {
		return publicationRepository.findByDate(date);
	}
	public Publication findPublicationBySourcepdf(String sourcepdf) {
		return publicationRepository.findBySourcepdf(sourcepdf);
	}
	

}
