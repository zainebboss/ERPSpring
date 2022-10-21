package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.User;
import tn.esprit.spring.models.Vacation;
import tn.esprit.spring.repository.VacationRepository;

@Service
public class VacationServiceImpl implements VacationService {

    @Autowired
    private VacationRepository vacationRepository;

    @Override
    public List<Vacation> getAllVacations() {
        return vacationRepository.findAll();
    }

    @Override
    public Vacation getVacationById(long id) {
        Optional<Vacation> optional = vacationRepository.findById(id);
        Vacation vacation = null;
        if (optional.isPresent()) {
            vacation = optional.get();
        } else {
            throw new RuntimeException(" Vacation not found for id :: " + id);
        }
        return vacation;
    }
    @Override
   	public Vacation updateVacation(Vacation v) {
   		// TODO Auto-generated method stub
   		return  vacationRepository.save(v);
   	}
    @Override
    public void deleteVacationById(long id) {
        this.vacationRepository.deleteById(id);
    }

    @Override
    public Vacation saveVacation(Vacation vacation) {
        vacationRepository.save(vacation);
        return vacation;
        
    }

    @Override
    public List<Vacation> getUserVacations(User user) {
        return vacationRepository.findAllByUser(user);
    }
    
}
