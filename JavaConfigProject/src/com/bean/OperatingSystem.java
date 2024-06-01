package com.bean;

public class OperatingSystem {
	
	private String name;
	private String model_Number;
	private String genration;
	private float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel_Number() {
		return model_Number;
	}
	public void setModel_Number(String model_Number) {
		this.model_Number = model_Number;
	}
	public String getGenration() {
		return genration;
	}
	public void setGenration(String genration) {
		this.genration = genration;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

	
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("model_Number"+model_Number);
		System.out.println("Price :"+price);
		System.out.println("Generation :"+genration);
	}
}
