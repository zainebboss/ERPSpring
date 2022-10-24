package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.models.Partenaire;
import tn.esprit.spring.repository.PartenaireRepository;
@Service
public class PartenaireService implements iPartenaireService {
	@Autowired
	private PartenaireRepository PartenaireRepository;
	
	@Override
	public List<Partenaire> retrieveAllPartenaire() {
		// TODO Auto-generated method stub
		List<Partenaire> Partenaires =(List<Partenaire>) PartenaireRepository.findAll();
		return Partenaires;
	}
		
	

	@Override
	public Partenaire addPartenaire(Partenaire c) {
		// TODO Auto-generated method stub
				PartenaireRepository.save(c);
				return c;
	}

	@Override
	public void deletePartenaire(Long id) {
		// TODO Auto-generated method stub
		PartenaireRepository.deleteById(id);
		System.out.println("Partenaire deleted successfully");
		
	}

	@Override
	public Partenaire updatePartenaire(Partenaire c) {
		
		PartenaireRepository.save(c);
		return c;
		
	}

	@Override
	public Partenaire retrievePartenaire(Long id) {
		// TODO Auto-generated method stub
		Partenaire Partenaire= PartenaireRepository.findById(id).orElse(null);
		return Partenaire;
	}



}
