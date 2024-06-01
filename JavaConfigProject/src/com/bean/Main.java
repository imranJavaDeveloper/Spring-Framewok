package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	public static void main(String args[]) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		OperatingSystem s=  (OperatingSystem) ctx.getBean("Op1");
		     s.show();
	}

}
