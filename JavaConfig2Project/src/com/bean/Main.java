package com.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Main {
	
	public static void main(String []args) {
		
		
		ApplicationContext ct= new AnnotationConfigApplicationContext(JavaConfig.class);
		  Mobile m=(Mobile) ct.getBean("m1");
		  m.show();
	}

}
