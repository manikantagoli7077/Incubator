package com.mani.restapidemo.model;

public class Customer {
	

	private String custId; 	
	private String custName;
	private String custAddress;
	private String custPhonenumber;
	
	public Customer() {
		super();
	}

	public Customer(String custId, String custName, String custAddress, String custPhonenumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custPhonenumber = custPhonenumber;
	}
	
	public String getcustId() {
		return custId;
	}

	public void setcustId(String custId) {
		this.custId = custId;
	}

	public String getcustName() {
		return custName;
	}

	public void setcustName(String custName) {
		this.custName = custName;
	}

	public String getcustAddress() {
		return custAddress;
	}

	public void setcustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getcustPhonenumber() {
		return custPhonenumber;
	}

	public void setcustPhonenumber(String custPhonenumber) {
		this.custPhonenumber = custPhonenumber;
	}

}
