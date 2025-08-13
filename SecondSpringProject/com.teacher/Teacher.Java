package com.teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Teacher {
	
	
	@Value("md Adil Alam")
	private String name;
	
	@Value("2548215")
	private int id;
	
	@Value("Gondapur Nawada 805110")
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	// create show method
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("Id:"+id);
		System.out.println("Address :"+address);
		
	}
}

/// this Spring example based on Annotation based with Xml Configuration 