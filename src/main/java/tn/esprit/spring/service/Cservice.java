package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.models.BanqueCr;






public interface Cservice {
	List<BanqueCr> AllCredit();

	BanqueCr addCredit(BanqueCr p);

	void deleteCredit(Long id);

	BanqueCr updateCredit(BanqueCr u);

	BanqueCr retrieveCredit(Long id);
	List<BanqueCr> retrieveCreditsByStatut(String statutcredit);

}
