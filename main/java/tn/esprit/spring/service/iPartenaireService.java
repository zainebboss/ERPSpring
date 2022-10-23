package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.models.Partenaire;


public interface iPartenaireService {
	List<Partenaire> retrieveAllPartenaire();

	Partenaire addPartenaire(Partenaire c);

	void deletePartenaire(Long id);

	Partenaire updatePartenaire(Partenaire c);

	Partenaire retrievePartenaire(Long id);
	
}
