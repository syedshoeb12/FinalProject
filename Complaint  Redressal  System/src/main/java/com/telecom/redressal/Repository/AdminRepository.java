package com.telecom.redressal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.redressal.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

	

}
