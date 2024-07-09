package com.example.demo.controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;


@RestController
public class PublicationRestController {
	@Autowired
	IPublicationService publicationService;
	
	@RequestMapping(value="/publications", method=RequestMethod.GET)
	public List<Publication> findPublications (){
	return publicationService.findAll();
	}
	@GetMapping(value="/publications/{id}")
	public Publication findById(@PathVariable Long id){
	return publicationService.findPublication(id);
	}

	//http://localhost:8081/publications/search/titre?titre=Mon publication 1
	@GetMapping(value="/publications/search/titre")
	public Publication findPublicationByTitle(@RequestParam String titre)
	{
	return publicationService.findPublicationByTitre(titre);
	}
	
	//http://localhost:8081/publications/search/type?type=publication1
	@GetMapping(value="/publications/search/type")
	public List<Publication> findPublicationByType(@RequestParam String type)
	{
	return publicationService.findPublicationByType(type);
	}
	
	//http://localhost:8081/publications/search/lien?lien=lien1
	@GetMapping(value="/publications/search/lien")
	public Publication findPublicationByLien(@RequestParam String lien)
	{
	return publicationService.findPublicationByLien(lien);
	}
	
	//http://localhost:8081/publications/search/sourcepdf?sourcepdf=sourcepdf1
	@GetMapping(value="/publications/search/sourcepdf")
	public Publication findPublicationBySourcePdf(@RequestParam String sourcepdf)
	{
	return publicationService.findPublicationBySourcepdf(sourcepdf);
	}
	
	@PostMapping(value="/publications/publication")
	public Publication addPublication(@RequestBody Publication p)
	{
	return publicationService.addPublication(p);
	}
	
	@DeleteMapping(value="/publications/{id}")
	public void deleteMembre(@PathVariable Long id)
	{
		publicationService.deletePublication(id);
	}
	@PutMapping(value="/publications/publication/{id}")
	public Publication updatemembre(@PathVariable Long id, @RequestBody Publication p)
	{
	p.setId(id);
	return publicationService.updatePublication(p);
	}
}
