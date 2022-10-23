package tn.esprit.spring.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.models.Fournisseur;
import tn.esprit.spring.service.Fservice;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "fournisseurs")
public class FournisseurCont {

	@Autowired
	Fservice servicef;
	@GetMapping("/all-fournisseurs")
	@ResponseBody
	public List<Fournisseur>getDetailFournisseurs(){
		List<Fournisseur> listDetailFournisseurs =servicef.AllFournisseur();
		return listDetailFournisseurs;
		
	}
	@PostMapping("/add-fournisseurs")

	@ResponseBody

	public Fournisseur addFournisseur(@RequestBody Fournisseur c)

	{

		Fournisseur Fournisseur = servicef.addFournisseur(c);

	return Fournisseur;

	}
	@DeleteMapping("/remove-fournisseur/{fournisseur-id}")

	@ResponseBody

	public void removeFournisseur(@PathVariable("fournisseur-id") Long id) {

		servicef.deleteFournisseur(id);

	}
	
	@PutMapping("/modify-fournisseur")

	@ResponseBody

	public Fournisseur modifyFournisseur(@RequestBody Fournisseur u) {

	return servicef.updateFournisseur(u);

	}
	@GetMapping("/retrieve-fournisseur/{fournisseur-id}")

	@ResponseBody

	public Fournisseur retrieveFournisseur(@PathVariable("fournisseur-id") Long id) {

	return servicef.retrieveFournisseur(id);

	}
}
