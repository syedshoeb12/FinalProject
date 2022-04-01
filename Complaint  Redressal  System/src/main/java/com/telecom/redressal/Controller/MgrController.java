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

import com.telecom.redressal.Model.Mgr;
import com.telecom.redressal.Service.MgrService;

@RestController
public class MgrController {
	
	@Autowired
	private MgrService mgrservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/managers")
	public List<Mgr> findAllMgrs()
	{
		return  mgrservice.getMgrs();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/managers/{MGR_ID}")
	public ResponseEntity<Mgr> get(@PathVariable Integer MGR_ID) {
	    try {
	    	Mgr mgr = mgrservice.get(MGR_ID);
	        return new ResponseEntity<Mgr>(mgr, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Mgr>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/managers")
public Mgr updateMgr(@RequestBody Mgr mgr ) {
		return  mgrservice.updateMgr(mgr);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/managers/{MGR_ID}")
	public void delete(@PathVariable Integer MGR_ID) {
		mgrservice.delete(MGR_ID);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/managers")
	public void save(@RequestBody Mgr mgr) {
		mgrservice.save(mgr);
	}

}
