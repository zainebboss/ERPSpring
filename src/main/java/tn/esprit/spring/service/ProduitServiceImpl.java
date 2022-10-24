package tn.esprit.spring.service;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.Produit;
import tn.esprit.spring.models.Rayon;
import tn.esprit.spring.models.Stock;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.RayonRepository;
import tn.esprit.spring.repository.StockRepository;


@Service
public class ProduitServiceImpl implements IProduit {
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private RayonRepository rayonRepository;

	@Override
	public List<Produit> retrieveAllProduits() {
		// TODO Auto-generated method stub
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		Rayon rayon = rayonRepository.getById(idRayon);
		Stock stock = stockRepository.getById(idStock);
		p.setRayon(rayon);
		p.setStock(stock);
		produitRepository.save(p);
		return p;
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteByIdProduit(id);

	}

	@Override
	public Produit updateProduit(Produit u) {
		// TODO Auto-generated method stub
		return produitRepository.save(u);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		// TODO Auto-generated method stub
		Produit produit = produitRepository.findByIdProduit(id);
		return produit;
	}

	@Override
	public void affecterProduitToStock(Long idProduit, Long idStock) {
		Stock s = stockRepository.findByIdStock(idStock);
		Produit produit = produitRepository.findByIdProduit(idProduit);
		produit.setStock(s);
		System.out.println(s.toString());
		produitRepository.save(produit);
		
	}

	@Override
	public void affecterProduitToRayon(Long idProduit, Long idRayon) {
		Rayon r = rayonRepository.findByIdRayon(idRayon);
		Produit produit = produitRepository.findByIdProduit(idProduit);
		produit.setRayon(r);
		produitRepository.save(produit);
	}

}
