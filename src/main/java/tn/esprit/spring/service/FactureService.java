package tn.esprit.spring.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.Facture;
import tn.esprit.spring.repository.FactureDao;

@Service
public class FactureService implements Iservice  {
@Autowired
	private FactureDao factureRepository;


@Override
public List<Facture> AllFactures() {
	// TODO Auto-generated method stub
	List<Facture> Factures = (List<Facture>) factureRepository.findAll();
	return Factures;
}

@Override
public Facture addFacture(Facture p) {
	// TODO Auto-generated method stub
	factureRepository.save(p);
	return p;
}
@Override
public void deleteFacture(Long id) {
	// TODO Auto-generated method stub
	factureRepository.deleteById(id);

}

@Override
public Facture updateFacture(Facture u) {
	// TODO Auto-generated method stub
	return factureRepository.save(u);
}

@Override
public Facture retrieveFacture(Long id) {
	// TODO Auto-generated method stub
	Facture Facture = factureRepository.findById(id).orElse(null);
	return Facture;
}
}
