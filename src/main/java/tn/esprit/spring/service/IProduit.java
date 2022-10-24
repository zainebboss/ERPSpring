package tn.esprit.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.models.Produit;


public interface IProduit {
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon, Long idStock);

	@Transactional
	void deleteProduit(Long id);

	Produit updateProduit(Produit u);

	Produit retrieveProduit(Long id);
	
	void affecterProduitToStock(Long idProduit,Long idStock);
	
	void affecterProduitToRayon(Long idProduit,Long idRayon);
}
