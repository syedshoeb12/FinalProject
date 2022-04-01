package com.telecom.redressal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TICKETSDAO {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
    public TICKETS[] showManagerTicket(int mgr_ID) {
	String cmd = "select * from ticket where  mgr_ID=? ";	
	List<TICKETS> ticketsList=jdbcTemplate.query(cmd, new Object[] {mgr_ID}, new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			TICKETS tickets = new TICKETS();
			tickets.setT_No(rs.getInt("T_No"));
			tickets.setCust_ID(rs.getInt("cust_ID"));
			tickets.setMgr_ID(rs.getInt("mgr_ID"));
			tickets.setEngr_ID(rs.getInt("engr_ID"));
			tickets.setPincode(rs.getInt("pincode"));
			tickets.setComplaint(rs.getString("Complaint"));
			tickets.setStatus(rs.getString("Status"));
			return tickets;
			
		}
	});
	return ticketsList.toArray(new TICKETS[ticketsList.size()]);
    }
    public TICKETS[] showEngineerTicket(int engr_ID) {
	String cmd = "select * from ticket where  engr_ID=?";	
List<TICKETS> ticketsList=jdbcTemplate.query(cmd, new Object[] {engr_ID}, new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			TICKETS tickets = new TICKETS();
			tickets.setT_No(rs.getInt("T_No"));
			tickets.setCust_ID(rs.getInt("cust_ID"));
			tickets.setMgr_ID(rs.getInt("mgr_ID"));
			tickets.setEngr_ID(rs.getInt("engr_ID"));
			tickets.setPincode(rs.getInt("pincode"));
			tickets.setComplaint(rs.getString("Complaint"));
			tickets.setStatus(rs.getString("Status"));
			return tickets;
			
		}
	});
	return ticketsList.toArray(new TICKETS[ticketsList.size()]);
    }

    public TICKETS[] showCustomerTicket(int cust_ID) {
	String cmd = "select * from ticket where  cust_ID=?";	
List<TICKETS> ticketsList=jdbcTemplate.query(cmd, new Object[] {cust_ID}, new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			TICKETS tickets = new TICKETS();
			tickets.setT_No(rs.getInt("T_No"));
			tickets.setCust_ID(rs.getInt("cust_ID"));
			tickets.setMgr_ID(rs.getInt("mgr_ID"));
			tickets.setEngr_ID(rs.getInt("engr_ID"));
			tickets.setPincode(rs.getInt("pincode"));
			tickets.setComplaint(rs.getString("Complaint"));
			tickets.setStatus(rs.getString("Status"));
			return tickets;
			
		}
	});
	return ticketsList.toArray(new TICKETS[ticketsList.size()]);
    }
}

