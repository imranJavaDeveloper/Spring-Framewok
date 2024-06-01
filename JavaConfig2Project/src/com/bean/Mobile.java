package com.bean;

public class Mobile {
	
	private String device_Name;
	public String getDevice_Name() {
		return device_Name;
	}
	public void setDevice_Name(String device_Name) {
		this.device_Name = device_Name;
	}
	public String getCamrea() {
		return camrea;
	}
	public void setCamrea(String camrea) {
		this.camrea = camrea;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private String camrea;
	private String battery;
	private float price;
	
	public void show() {
		System.out.println("Device Name :"+device_Name);
		System.out.println("camrea :"+camrea);
		System.out.println("battery"+battery);
		System.out.println("price"+price);
	}
	

}
