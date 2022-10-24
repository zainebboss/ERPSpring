package tn.esprit.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.BanqueCr;
import tn.esprit.spring.repository.CreditDao;



@Service
public class CreditService implements Cservice  {

	@Autowired
	private CreditDao creditRepository;


@Override
public List<BanqueCr> AllCredit() {
	// TODO Auto-generated method stub
	List<BanqueCr> Credits = (List<BanqueCr>) creditRepository.findAll();
	return Credits;
}

@Override
public BanqueCr addCredit(BanqueCr p) {
	// TODO Auto-generated method stub
	creditRepository.save(p);
	return p;
}
@Override
public void deleteCredit(Long id) {
	// TODO Auto-generated method stub
	creditRepository.deleteById(id);

}

@Override
public BanqueCr updateCredit(BanqueCr u) {
	// TODO Auto-generated method stub
	return creditRepository.save(u);
}

@Override
public BanqueCr retrieveCredit(Long id) {
	// TODO Auto-generated method stub
	BanqueCr Credits = creditRepository.findById(id).orElse(null);
	return  Credits;
}

@Override
		public List<BanqueCr> retrieveCreditsByStatut(String statutcredit) {
			return creditRepository.getCreditByStatut(statutcredit);
		}
		
}
