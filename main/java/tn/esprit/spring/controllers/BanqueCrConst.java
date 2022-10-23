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

import tn.esprit.spring.models.BanqueCr;
import tn.esprit.spring.service.Cservice;




@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping(value = "credits")
public class BanqueCrConst {

	@Autowired
	Cservice cService;
	@GetMapping("/all-credits")
	@ResponseBody
	public List<BanqueCr>getDetailCredit(){
		List<BanqueCr> listDetailCredit =cService.AllCredit();
		return listDetailCredit;
		
	}
	@PostMapping("/add-c")

	@ResponseBody

	public BanqueCr addCredit(@RequestBody BanqueCr c)

	{

		BanqueCr Credit = cService.addCredit(c);

	return Credit;

	}
	@DeleteMapping("/remove-credit/{credit-id}")

	@ResponseBody

	public void removeCredit(@PathVariable("credit-id") Long id) {

		cService.deleteCredit(id);

	}
	@PutMapping("/modify-credit")

	@ResponseBody

	public BanqueCr modifyCredit(@RequestBody BanqueCr u) {

	return cService.updateCredit(u);

	}
	@GetMapping("/retrieve-credit/{credit-id}")

	@ResponseBody

	public BanqueCr retrieveCredit(@PathVariable("credit-id") Long id) {

	return cService.retrieveCredit(id);

	}
	
	@GetMapping(value="/getCreditByStatus/{statut}")
	@ResponseBody
	public List<BanqueCr> retrieveCreditsByStatut(@PathVariable("statut") String statutcredit){
		return cService.retrieveCreditsByStatut("%"+statutcredit+"%") ;
	}

        
        


       
}



