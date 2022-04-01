package com.telecom.redressal.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.redressal.Model.Engr;

@Repository

public interface EngrRepository extends JpaRepository<Engr,Integer> {

}
