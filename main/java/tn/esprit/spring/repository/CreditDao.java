package tn.esprit.spring.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.models.BanqueCr;
@Repository
public interface CreditDao extends JpaRepository <BanqueCr ,Long>{
	   @Query("select p from BanqueCr p  where StatutCredit like :statut")
			List<BanqueCr> getCreditByStatut(@Param("statut") String statutcredit );
	 
}
