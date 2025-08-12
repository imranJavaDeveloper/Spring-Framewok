package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

import org.springframework.context.ApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		String config="/com/resourece/applicationContext.xml";
		
		  ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		  Student st = (Student) context.getBean("std1");
		  st.show();
		       
	        
	}

}
