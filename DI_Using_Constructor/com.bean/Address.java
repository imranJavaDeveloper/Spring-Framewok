package com.bean;

public class Address {
	
	
	private String areaNumber;
	private String phone_Number;
	private String houseno;
	
	
	public Address(String areaNumber, String phone_Number, String houseno) {
		
		this.areaNumber = areaNumber;
		this.phone_Number = phone_Number;
		this.houseno = houseno;
	}

	@Override
	public String toString() {
		return "Address [areaNumber=" + areaNumber + ", phone_Number=" + phone_Number + ", houseno=" + houseno + "]";
	}

}
