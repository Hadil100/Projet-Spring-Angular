package com.example.demo.dao;

import java.util.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Publication;



public interface PublicationRepository extends JpaRepository<Publication,Long>{
  
 
  public Publication findByTitre(String titre);
  public List<Publication> findByType(String type);
  public Publication findByLien(String lien);
  public List<Publication> findByDate(Date date);
  public Publication findBySourcepdf(String sourcepdf);
}
