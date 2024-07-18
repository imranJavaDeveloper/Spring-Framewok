package simple2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import simple2.bean.Teacher;

public class Main {
	
	
public static void main(String []args) {
	
	String config_locatio="/simple2/resource/applicationContext.xml";
	

	
	ApplicationContext context= new ClassPathXmlApplicationContext(config_locatio);
	
	    
	Teacher t= (Teacher) context.getBean("teacher1");
	t.show();
}
}
