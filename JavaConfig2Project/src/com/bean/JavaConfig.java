package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Mobile m1() {
		
		Mobile obj= new Mobile();
		
		obj.setBattery("5000 MH");
		obj.setCamrea("45mp front 65mp back");
		obj.setDevice_Name("mi note 11t 5g ");
		obj.setPrice(2300.45f);
		return obj;
		
	}

}
