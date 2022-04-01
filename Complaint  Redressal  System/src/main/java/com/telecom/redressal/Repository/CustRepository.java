package com.telecom.redressal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.redressal.Model.Customer;

@Repository
public interface CustRepository extends JpaRepository<Customer,Integer>{

}
