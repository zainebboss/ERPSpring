package tn.esprit.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.Fournisseur;
import tn.esprit.spring.repository.FournisseurDao;




@Service
public class FournisseurService implements Fservice {
	@Autowired
	private FournisseurDao fournisseurRepository;



@Override
public List<Fournisseur> AllFournisseur() {
	// TODO Auto-generated method stub
	List<Fournisseur> Fournisseurs = (List<Fournisseur>) fournisseurRepository.findAll();
	return Fournisseurs;
}

@Override
public Fournisseur addFournisseur(Fournisseur p) {
	// TODO Auto-generated method stub
	fournisseurRepository.save(p);
	return p;
}
@Override
public void deleteFournisseur(Long id) {
	// TODO Auto-generated method stub
	fournisseurRepository.deleteById(id);

}

@Override
public Fournisseur updateFournisseur(Fournisseur u) {
	// TODO Auto-generated method stub
	return fournisseurRepository.save(u);
}

@Override
public Fournisseur retrieveFournisseur(Long id) {
	// TODO Auto-generated method stub
	Fournisseur Fournisseur = fournisseurRepository.findById(id).orElse(null);
	return Fournisseur;
}
}
