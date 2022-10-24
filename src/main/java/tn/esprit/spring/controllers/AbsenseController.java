package tn.esprit.spring.controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import tn.esprit.spring.models.Absense;
import tn.esprit.spring.models.User;
import tn.esprit.spring.service.AbsenseService;

@RestController
@RequestMapping("/absenses")
public class AbsenseController {

    @Autowired
    private AbsenseService absenseService;


    @GetMapping("/all")
    public List<Absense>getAbsense(){
		List<Absense> ListAbsenses =absenseService.getAllAbsenses();
		return ListAbsenses;
    }
    
    @PostMapping("/add")

    @ResponseBody

    public Absense addAbsense(@RequestBody Absense a)

    {

    	Absense absense = absenseService.addAbsense(a);

    return absense;

    }

 
    
    @DeleteMapping("/remove/{absense-id}")

    @ResponseBody

    public void removeAbsense(@PathVariable("absense-id") Long id) {

    	absenseService.deleteAbsenseById(id);

    }
    @PutMapping("/modify")

    @ResponseBody

    public Absense modifyAbsense(@RequestBody Absense a) {

    return absenseService.updateAbsense(a);

    }
    @GetMapping("/retrieve/{user-id}")

    @ResponseBody

    public Absense retrieveEmployee(@PathVariable("user-id") Long id) {

    return absenseService.getAbsenseById(id);

    }

    // @GetMapping("/details/{id}")
    // public String details(@PathVariable(value = "id") long id, Model model) {
    // Employee employee = absenseService.getEmployeeById(id);

    // model.addAttribute("employee", employee);
    // return "employees/details";
    // }

    // @GetMapping("/edit/{id}")
    // public String showFormForUpdate(@PathVariable(value = "id") long id, Model
    // model) {
    // Employee employee = absenseService.getEmployeeById(id);

    // model.addAttribute("employee", employee);
    // return "employees/edit";
    // }

    // @GetMapping("/delete/{id}")
    // public String deleteEmployee(@PathVariable(value = "id") long id) {

    // this.absenseService.deleteEmployeeById(id);
    // return "redirect:/employees/all";
    // }
}
