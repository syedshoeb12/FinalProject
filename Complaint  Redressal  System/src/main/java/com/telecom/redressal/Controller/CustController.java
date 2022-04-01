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

import com.telecom.redressal.Model.Customer;
import com.telecom.redressal.Service.CustService;

@RestController
public class CustController {
	
	@Autowired
	private CustService custservice;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customers")
	public List<Customer> findAllCusts(){
		return custservice.getCusts();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customers/{Cust_ID}")
	public ResponseEntity<Customer> get(@PathVariable Integer Cust_ID) {
	    try {
	    	Customer cust = custservice.get(Cust_ID);
	        return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	    }      
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/customers/{Cust_ID}")
	public void delete(@PathVariable("Cust_ID") int Cust_ID) {
		custservice.delete(Cust_ID);
	
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/customers")
	public void save(@RequestBody 	Customer cust) {
		this.custservice.save(cust);
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/customers")
public Customer updateCust(@RequestBody Customer cust) {
		return  custservice.updateCust(cust);
	}
		
}


