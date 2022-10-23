package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;

import tn.esprit.spring.Generate.FacturePDFExporter;
import tn.esprit.spring.models.Facture;
import tn.esprit.spring.service.Iservice;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//import com.lowagie.text.DocumentException;

import javax.servlet.http.HttpServletResponse;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("factures")
public class FactureCont {

	@Autowired
	Iservice fService;
	@GetMapping("/all-facture")
	@ResponseBody
	public List<Facture>getDetailFactures(){
		List<Facture> listDetailFactures =fService.AllFactures();
		return listDetailFactures;
		
	}
	@PostMapping("/add-f")

	@ResponseBody

	public Facture addFacture(@RequestBody Facture c)

	{

		Facture Facture = fService.addFacture(c);

	return Facture;

	}
	@DeleteMapping("/remove-facture/{facture-id}")

	@ResponseBody

	public void removeFavture(@PathVariable("facture-id") Long id) {

	fService.deleteFacture(id);

	}
	@PutMapping("/modify-facture")

	@ResponseBody

	public Facture modifyFacture(@RequestBody Facture u) {

	return fService.updateFacture(u);

	}
	@GetMapping("/retrieve-facture/{facture-id}")

	@ResponseBody

	public Facture retrieveFacture(@PathVariable("facture-id") Long id) {

	return fService.retrieveFacture(id);

	}
	
	
	
	@GetMapping("/export")
	public  void exportToPdf  (HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());
		
	String headerKey = "Content-Disposition";
		String headerValue = "attachement; filename=facture_" + currentDateTime +  ".pdf" ;
		
	response.setHeader(headerKey, headerValue);
		
		List<Facture> listFactures = fService.AllFactures();
		
	FacturePDFExporter exporter = new FacturePDFExporter(listFactures);
		exporter.export(response);
			
	}

}
