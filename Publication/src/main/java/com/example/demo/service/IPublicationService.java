package com.example.demo.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Publication;

public interface IPublicationService {
	
	public Publication addPublication(Publication p);
	public void deletePublication(Long id) ;
	public Publication updatePublication(Publication p) ;
	public Publication findPublication(Long id) ;
	public List<Publication> findAll();
	public Publication findPublicationByTitre(String titre) ;
	public List<Publication> findPublicationByType(String type) ;
	public Publication findPublicationByLien(String lien) ;
	public List<Publication> findPublicationByDate(Date date) ;
	public Publication findPublicationBySourcepdf(String sourcepdf) ;

	
}
