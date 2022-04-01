package com.telecom.redressal.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.redressal.Model.Engr;
import com.telecom.redressal.Model.Mgr;
import com.telecom.redressal.Repository.EngrRepository;

@Service
@Transactional
public class EngrService {

	@Autowired
	private EngrRepository Engrepository;
	
	public List<Engr> getEngrs() {
		// TODO Auto-generated method stub
		return Engrepository.findAll();
	}

	public Engr saveEngr(Engr engr) {
		return Engrepository.save(engr);
		
	}

	public List<Engr> saveEngrs(List<Engr> engrs) {
		return Engrepository.saveAll(engrs);
	
	}
		
	

	public Engr get(Integer ENGR_ID) {
		// TODO Auto-generated method stub
		return Engrepository.findById(ENGR_ID).get();
	}

	public void save(Engr engr) {
		Engrepository.save(engr);
		
	}	    

    public void delete(Integer ENGR_ID) {
    	Engrepository.deleteById(ENGR_ID);
    }
    public Engr updateEngr(Engr engr) {
		Integer engr_ID = engr.getENGR_ID();
		Engr eg = Engrepository.findById(engr_ID).get();
		eg.setENGRNAME(engr.getENGRNAME());
		eg.setPINCODE(engr.getPINCODE());
		eg.setMOBILENO(engr.getMOBILENO());
		return Engrepository.save(eg);
	}



}
