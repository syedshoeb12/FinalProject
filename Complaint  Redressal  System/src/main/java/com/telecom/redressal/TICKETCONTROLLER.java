package com.telecom.redressal;


import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;
	import java.util.Date;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.RowMapper;
	import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.redressal.TICKETS;
import com.telecom.redressal.TICKETSDAO;

@RestController
	public class TICKETCONTROLLER {
	@Autowired
		private TICKETSERVICE ticketService;

		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping("/Manager/{mgr_ID}")
		public TICKETS[] showManagerTicket(@PathVariable int mgr_ID) {
			return ticketService.showManagerTicket(mgr_ID);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping("/Engineer/{engr_ID}")
		public TICKETS[] showEngineerTicket(@PathVariable int engr_ID) {
			return ticketService.showEngineerTicket(engr_ID);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping("/Customer/{cust_ID}")
		public TICKETS[] showCustomerTicket(@PathVariable int cust_ID) {
			return ticketService.showCustomerTicket(cust_ID);
		}
	
}

