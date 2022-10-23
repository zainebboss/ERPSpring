package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.models.Facture;





public interface Iservice {
	List<Facture> AllFactures();

	Facture addFacture(Facture p);

	void deleteFacture(Long id);

	Facture updateFacture(Facture u);

	Facture retrieveFacture(Long id);
}
