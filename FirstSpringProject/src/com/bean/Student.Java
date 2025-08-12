package com.bean;

public class Student {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int roll;
	private String email;
	
	
	public void show() {
		System.out.println("name ="+name);
		System.out.println("Roll ="+roll);
		System.out.println("Email ="+email);
		
	}
	

}
