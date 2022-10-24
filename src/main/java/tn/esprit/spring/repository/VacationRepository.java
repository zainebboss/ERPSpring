package tn.esprit.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.models.User;
import tn.esprit.spring.models.Vacation;

import java.util.List;

@Repository
public interface VacationRepository extends JpaRepository<Vacation, Long> {

  List<Vacation> findAllByUser(User user);

}
