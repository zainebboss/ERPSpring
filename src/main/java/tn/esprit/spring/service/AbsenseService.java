package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.models.Absense;
import tn.esprit.spring.models.User;


public interface AbsenseService {
    List<Absense> getAllAbsenses();

    Absense getAbsenseById(long id);

    void deleteAbsenseById(long id);

	Absense updateAbsense(Absense a);

	Absense addAbsense(Absense a);

	List<Absense> getUserAbsenses(User user);


	Absense saveAbsense(Absense absense);

}
