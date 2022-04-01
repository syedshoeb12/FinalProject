package com.telecom.redressal;

public class TICKETS {

	private  int T_NO;
	private int cust_ID;
	private int mgr_ID;
	private int engr_ID;
	private int  pincode;
	private String Complaint;
	private String Status;
	public int getT_NO() {
		return T_NO;
	}
	public void setT_No(int t_NO) {
		T_NO = t_NO;
	}
	public int getCust_ID() {
		return cust_ID;
	}
	public void setCust_ID(int cust_ID) {
		this.cust_ID = cust_ID;
	}
	public int getMgr_ID() {
		return mgr_ID;
	}
	public void setMgr_ID(int mgr_ID) {
		this.mgr_ID = mgr_ID;
	}
	public int getEngr_ID() {
		return engr_ID;
	}
	public void setEngr_ID(int engr_ID) {
		this.engr_ID = engr_ID;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getComplaint() {
		return Complaint;
	}
	public void setComplaint(String complaint) {
		Complaint = complaint;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
