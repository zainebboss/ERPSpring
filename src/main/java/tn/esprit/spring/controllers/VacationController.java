package tn.esprit.spring.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.models.Absense;
import tn.esprit.spring.models.User;
import tn.esprit.spring.models.Vacation;
import tn.esprit.spring.service.AbsenseService;
import tn.esprit.spring.service.UserService;
import tn.esprit.spring.service.VacationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/vacations")
public class VacationController {

    @Autowired
    private VacationService vacationService;
    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<Vacation>getVacation(){
		List<Vacation> ListVacation =vacationService.getAllVacations();
		return ListVacation;
   
    }

    @PostMapping("/add")

    @ResponseBody

    public Vacation addAbsense(@RequestBody Vacation data)

    {
    	System.out.print(data);
    	User user= userService.getUserById(data.getUser().getId());
    	
    	Vacation vacation = new Vacation();
    	vacation.setEnd(data.getEnd());
    	vacation.setStart(data.getStart());
    	vacation.setUser(user);

    return vacationService.saveVacation(vacation);
    

    }
   
    
    @DeleteMapping("/remove/{vacation-id}")

    @ResponseBody

    public void removeVacation(@PathVariable("vacation-id") Long id) {

    	vacationService.deleteVacationById(id);

    }
    @PutMapping("/modify")

    @ResponseBody

    public Vacation modifyVacation(@RequestBody Vacation v) {

    return vacationService.updateVacation(v);

    }
    @GetMapping("/retrieve/{vacation-id}")

    @ResponseBody

    public Vacation retrieveVacation(@PathVariable("vacation-id") Long id) {

    return vacationService.getVacationById(id);

    }
    

    // @GetMapping("/details/{id}")
    // public String details(@PathVariable(value = "id") long id, Model model) {
    // Employee employee = vacationService.getEmployeeById(id);

    // model.addAttribute("employee", employee);
    // return "employees/details";
    // }

    // @GetMapping("/edit/{id}")
    // public String showFormForUpdate(@PathVariable(value = "id") long id, Model
    // model) {
    // Employee employee = vacationService.getEmployeeById(id);

    // model.addAttribute("employee", employee);
    // return "employees/edit";
    // }

    // @GetMapping("/delete/{id}")
    // public String deleteEmployee(@PathVariable(value = "id") long id) {

    // this.vacationService.deleteEmployeeById(id);
    // return "redirect:/employees/all";
    // }
}