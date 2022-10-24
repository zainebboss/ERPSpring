package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

import tn.esprit.spring.models.Partenaire;
import tn.esprit.spring.service.PartenaireService;

	@RestController
	@CrossOrigin
	@RequestMapping("/api/test")
	public class PartenaireController {
		@Autowired
		PartenaireService PartenaireService;
		  @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
		@PutMapping("/update-Partenaire")
		@ResponseBody
		public Partenaire updatePartenaire(@RequestBody Partenaire c)
		{
		Partenaire Partenaire = PartenaireService.updatePartenaire(c);
				return Partenaire;
		}

		  @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")

		@GetMapping("/retrive-all-Partenaires")
		@ResponseBody
		public List<Partenaire> getPartenaires(){
			List<Partenaire> listPartenaires = PartenaireService.retrieveAllPartenaire();
		
			return listPartenaires;
		}
		  @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
		@GetMapping("/retrieve-Partenaire/{Partenaire-id}")
		@ResponseBody
		public Partenaire retrivePartenaire(@PathVariable("Partenaire-id")Long PartenaireId) {
			return PartenaireService.retrievePartenaire	(PartenaireId);
			}
		

		  @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
		@PostMapping("/add-Partenaire")
		@ResponseBody
		
		public Partenaire addPartenaire(@RequestBody Partenaire c)
		{
		Partenaire Partenaire = PartenaireService.addPartenaire(c);
		return Partenaire;
		}
		  @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
		// http://localhost:8089/SpringMVC/Partenaire/remove-Partenaire/{Partenaire-id}
		@DeleteMapping("/remove-Partenaire/{Partenaire-id}")
		@ResponseBody
		public void removePartenaire(@PathVariable("Partenaire-id") Long PartenaireId) {
		PartenaireService.deletePartenaire(PartenaireId);
		}
		


}
