package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.models.Fournisseur;



@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {

}
