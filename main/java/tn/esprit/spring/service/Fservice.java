package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.models.Fournisseur;





public interface Fservice {
	List<Fournisseur> AllFournisseur();

	Fournisseur addFournisseur(Fournisseur p);

	void deleteFournisseur(Long id);

	Fournisseur updateFournisseur(Fournisseur u);

	Fournisseur retrieveFournisseur(Long id);
}
