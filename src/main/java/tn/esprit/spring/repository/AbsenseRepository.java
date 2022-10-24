package tn.esprit.spring.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.models.Absense;
import tn.esprit.spring.models.User;

import java.util.List;

@Repository
public interface AbsenseRepository extends JpaRepository<Absense, Long> {

  List<Absense> findAllByUser(User user);

}
