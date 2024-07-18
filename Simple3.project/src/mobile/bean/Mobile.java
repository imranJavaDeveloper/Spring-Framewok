package mobile.bean;
public class Mobile {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDevice_model() {
		return device_model;
	}
	public void setDevice_model(String device_model) {
		this.device_model = device_model;
	}
	public String getBatery_mh() {
		return batery_mh;
	}
	public void setBatery_mh(String batery_mh) {
		this.batery_mh = batery_mh;
	}
	
	
	
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("Price:"+price);
		System.out.println("Device_Model :"+device_model);
		System.out.println("batey-mh:"+batery_mh);
		
	}
	private double price;
	private String device_model;
	private String batery_mh;
	
	

}
