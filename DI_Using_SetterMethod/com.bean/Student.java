package com.bean;

public class Student {
	
	private String name;
	private int roll;
	private String email;
	
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("Roll :"+roll);
		System.out.println("Email :"+email);
		System.out.println("Address :"+address);
		
		}



}
