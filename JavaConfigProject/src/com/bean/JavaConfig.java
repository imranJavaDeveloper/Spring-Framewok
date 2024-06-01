package com.bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public OperatingSystem Op1() {
		OperatingSystem op= new OperatingSystem();
		op.setGenration("core i3");
		op.setModel_Number(" inspiron 15300");
		op.setName("LapTop");
		op.setPrice(54000);
		return op;
		
	}
}
