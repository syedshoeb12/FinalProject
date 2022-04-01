package com.telecom.redressal.Controller;

import java.util.List;
import java.util.NoSuchElementException;

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
import org.springframework.web.bind.annotation.RestController;

import com.telecom.redressal.Model.Engr;
import com.telecom.redressal.Service.EngrService;

@RestController
public class EngrController {
	
	@Autowired
  private EngrService engrService;
	
	@CrossOrigin(origins = "http://localhost:4200")
 @GetMapping("/engineers")
	
		public List<Engr> findAllEngrs()
		{
			return engrService.getEngrs();
		}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/engineers/{ENGR_ID}")
	public ResponseEntity<Engr> get(@PathVariable Integer ENGR_ID) {
	    try {
	    	Engr engr = engrService.get(ENGR_ID);
	        return new ResponseEntity<Engr>(engr, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Engr>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/engineers")
public Engr updateEngr(@RequestBody Engr engr) {
		return  engrService.updateEngr(engr);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/engineers/{ENGR_ID}")
	public void delete(@PathVariable Integer ENGR_ID) {
		engrService.delete(ENGR_ID);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/engineers")
	public void add(@RequestBody 	Engr engr) {
		engrService.save(engr);
	}

}


