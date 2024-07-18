package mobile.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mobile.bean.Mobile;

import org.springframework.context.ApplicationContext;


public class main {
	public static void main(String [] args) {
		
		
		String config_location="/mobile/resource/applicationContext.xml";
		
		ApplicationContext context= new ClassPathXmlApplicationContext(config_location);
		
		Mobile mob= (Mobile)context.getBean("mobile1");
		
		mob.show();
	}

}
