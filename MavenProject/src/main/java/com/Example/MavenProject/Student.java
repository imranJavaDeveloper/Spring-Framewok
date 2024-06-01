package com.Example.MavenProject;

public class Student {
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String id;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);

	}
	

}
