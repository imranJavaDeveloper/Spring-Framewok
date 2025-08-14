package com.bean;

public class Address {
	
	
	private String areaNumber;
	
	private String phone_Number;
	private String houseno;
	
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public void setAreaNumber(String areaNumber) {
		this.areaNumber = areaNumber;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	
	@Override
	public String toString() {
		return "Address [areaNumber=" + areaNumber + ", phone_Number=" + phone_Number + ", houseno=" + houseno + "]";
	}

}
