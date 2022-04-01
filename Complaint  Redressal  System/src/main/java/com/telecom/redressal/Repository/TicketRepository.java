package com.telecom.redressal.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.redressal.Model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
