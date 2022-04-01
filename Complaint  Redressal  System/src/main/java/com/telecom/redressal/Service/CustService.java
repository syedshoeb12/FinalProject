package com.telecom.redressal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telecom.redressal.Model.Customer;
import com.telecom.redressal.Model.Ticket;
import com.telecom.redressal.Repository.CustRepository;

@Service
@Transactional
public class CustService {

	@Autowired
	private CustRepository custrepository;
	
	public Customer saveCust(Customer cust) {
		return custrepository.save(cust);
		
	}

	public List<Customer> saveCusts(List<Customer> custs) {
		return custrepository.saveAll(custs);
	
	}
	public List<Customer> getCusts(){
		return custrepository.findAll();
		
	}

	public Customer get(Integer cust_ID) {
		// TODO Auto-generated method stub
		return custrepository.findById(cust_ID).get();
	}

	public void save(Customer cust) {
		custrepository.save(cust);
		
	}	    

    public void delete(Integer Cust_ID) {
    	custrepository.deleteById(Cust_ID);
    }
    public Customer updateCust(Customer cust) {
		Integer cust_ID = cust.getCust_ID();
		Customer cts = custrepository.findById(cust_ID).get();
		cts.setCustName(cust.getCustName());
		cts.setAddress(cust.getAddress());
		cts.setPincode(cust.getPincode());
		cts.setMobileNo(cust.getMobileNo());
		return custrepository.save(cts);
	}
}


