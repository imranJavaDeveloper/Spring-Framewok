package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.teacher.Teacher;

public class Main {
	
	public static void main(String args[]) {
		
		 ApplicationContext context =
	                new ClassPathXmlApplicationContext("/com/resource/applicationContext.xml");
		 
		   Teacher st= (Teacher) context.getBean("teacher");
		   st.show();
	}

}
