package com.bean;

public class Student {
	
	private String name;
	private int roll;
	private String email;
	
	private Address address;
	
	
	public Student(String name,int roll,String email,Address address) {
		this.name=name;
		this.email=email;
		this.roll=roll;
		this.address=address;
	}
	
	
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("roll :"+roll);
		System.out.println("Email :"+email);
		System.out.println("Address :"+address);
	}



}
