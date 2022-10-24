package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.Absense;
import tn.esprit.spring.models.User;
import tn.esprit.spring.repository.AbsenseRepository;

@Service
public class AbsenseServiceImpl implements AbsenseService {

    @Autowired
    private AbsenseRepository absenseRepository;

    @Override
    public List<Absense> getAllAbsenses() {
        return absenseRepository.findAll();
    }

    @Override
    public Absense getAbsenseById(long id) {
        Optional<Absense> optional = absenseRepository.findById(id);
        Absense Absense = null;
        if (optional.isPresent()) {
            Absense = optional.get();
        } else {
            throw new RuntimeException(" Absense not found for id :: " + id);
        }
        return Absense;
    }

    @Override
    public void deleteAbsenseById(long id) {
        this.absenseRepository.deleteById(id);
    }
    @Override
   	public Absense updateAbsense(Absense a) {
   		// TODO Auto-generated method stub
   		return absenseRepository.save(a);
   	}
    @Override
    public Absense addAbsense(Absense a) {
    	absenseRepository.save(a);
        return a;
    }
    @Override
    public Absense saveAbsense(Absense absense) {
        absenseRepository.save(absense);
        return absense;
    }

    @Override
    public List<Absense> getUserAbsenses(User user) {
        return absenseRepository.findAllByUser(user);
    }
}
