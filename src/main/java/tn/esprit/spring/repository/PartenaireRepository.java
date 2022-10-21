package tn.esprit.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.models.Partenaire;

@Repository
public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {

}

