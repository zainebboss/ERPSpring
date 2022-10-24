package tn.esprit.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.models.Rayon;


public interface IRayon {
	List<Rayon> retrieveAllRayons();

	Rayon addRayon(Rayon r);

	@Transactional
	void deleteRayon(Long id);
	
	Rayon deleteRayonByState(Long id);

	Rayon updateRayon(Rayon r);

	Rayon retrieveRayon(Long id);
	
	List<Rayon> rechercheAvancee(String string);
	
	List<Rayon> retrieveAllRayonsSorted();
	
	List<Rayon> retrieveAllRayonSortedByProductsNumber();
	
	List<Rayon> filterByProductsPrice(float min, float max);
	
	List<Rayon> retrieveActive();
	
	List<Rayon> retrieveDeleted();
	
	
}
