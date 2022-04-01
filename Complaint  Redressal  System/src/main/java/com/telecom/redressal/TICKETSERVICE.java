package com.telecom.redressal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TICKETSERVICE {

		@Autowired
		TICKETSDAO dao;
		
		public TICKETS[] showManagerTicket(int mgr_ID) {
			return dao.showManagerTicket(mgr_ID);
		}
		public TICKETS[] showEngineerTicket(int engr_ID) {
			return dao.showEngineerTicket(engr_ID);
		}
		public TICKETS[] showCustomerTicket(int cust_ID) {
			return dao.showCustomerTicket(cust_ID);
		}
		
	}



	

