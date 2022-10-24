package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.models.User;
import tn.esprit.spring.models.Vacation;



public interface VacationService {
    List<Vacation> getAllVacations();

    List<Vacation> getUserVacations(User user);

    Vacation getVacationById(long id);

    void deleteVacationById(long id);

	Vacation updateVacation(Vacation v);

	Vacation saveVacation(Vacation vacation);
}
