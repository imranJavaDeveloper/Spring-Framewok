package simple.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import simple.bean.Strudent;

import org.springframework.context.ApplicationContext;
public class main {
	
	public static void main(String args[] ) {
		
		// provide application context
		
		String config_location="/simple/resources/applicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(config_location);
		
		
		// check value insert or not
		
		Strudent st= (Strudent) context.getBean("stdId2");
		
		st.show();
	}

}
