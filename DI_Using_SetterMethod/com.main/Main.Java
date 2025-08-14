package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class Main {
public static void main(String[] args) {
	
	 ApplicationContext context =
             new ClassPathXmlApplicationContext("/com/resource/applicationContext.xml");
	 
	   Student st= (Student) context.getBean("std1");
	   st.show();
	
}
}
