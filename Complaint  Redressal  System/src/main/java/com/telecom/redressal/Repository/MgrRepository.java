package com.telecom.redressal.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.redressal.Model.Mgr;

@Repository
public interface MgrRepository extends JpaRepository<Mgr,Integer>{

}