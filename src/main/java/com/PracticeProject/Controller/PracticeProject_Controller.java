package com.PracticeProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeProject.Model.PracticeProject_Model;
import com.PracticeProject.Service.PracticeProjectService;




@RestController
public class PracticeProject_Controller {
	@Autowired
	private PracticeProjectService practiceProjectService;
@GetMapping("/home")
public String home() {
	return "Welcome to Homepage";
}

@GetMapping("/Practices")
public List<PracticeProject_Model> getPractices(){
	
	return practiceProjectService.getPractices();
}	

@GetMapping("/Practices/{Id}")
public PracticeProject_Model getPractice(@PathVariable int Id) {
	return practiceProjectService.getPractice(Id) ;
}
@PostMapping("/Practices")
public PracticeProject_Model addPractice(@RequestBody PracticeProject_Model practice) {
	
	return practiceProjectService.addPractice(practice);
}
@PutMapping("/Practices/{Id}")
public PracticeProject_Model updatePractice(@PathVariable int Id,@RequestBody PracticeProject_Model practice) {
	return practiceProjectService.updatePractice(practice,Id);
}
@DeleteMapping("/Practices/{Id}")
public String deletePractice(@PathVariable int Id) {
	
	String s=practiceProjectService.deletePractice(Id) ;
	return s;
}

}
