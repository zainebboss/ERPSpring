package tn.esprit.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.models.User;
import tn.esprit.spring.repository.UserRepository;
@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository;
	 
	 public User getUserById(Long long1) {
	        Optional<User> optional = userRepository.findById(long1);
	        return  optional.get();
  
	    }
}
