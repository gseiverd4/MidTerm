package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {

	private Date DOB;

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public PersonException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		System.out.println("This is an invalid phone number");
	}
}
