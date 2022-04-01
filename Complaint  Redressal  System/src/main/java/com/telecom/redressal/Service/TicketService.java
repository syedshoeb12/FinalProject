package com.telecom.redressal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telecom.redressal.Model.Customer;
import com.telecom.redressal.Model.Ticket;
import com.telecom.redressal.Repository.TicketRepository;

@Service
@Transactional
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	public List<Ticket> getTickets(){
		return ticketRepository.findAll();
	}
		
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
			
	}

	public List<Ticket> saveTickets(List<Ticket> tickets) {
		return ticketRepository.saveAll(tickets);
	}
	public Ticket get(Integer T_NO) {
		return ticketRepository.findById(T_NO).get();
	}
    public void save(Ticket ticket) {
    	ticketRepository.save(ticket);
	}	    

	 public void delete(Integer T_NO) {
		 ticketRepository.deleteById(T_NO);
	  }
	   public Ticket updateTicket(Ticket ticket) {
			Integer t_NO = ticket.getT_NO();
			Ticket ts = ticketRepository.findById(t_NO).get();
			ts.setCust_ID(ticket.getCust_ID());
			ts.setMgr_ID(ticket.getMgr_ID());
			ts.setEngr_ID(ticket.getEngr_ID());
			ts.setPincode(ticket.getPincode());
			ts.setComplaint(ticket.getComplaint());
			ts.setStatus(ticket.getStatus());
			return ticketRepository.save(ts);
		}
	}

