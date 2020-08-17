package com.mukesh.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	
	 @Bean(name="cal")
	public Calendar createCalendar() {
		 System.out.println("AppConfig.createCalendar()");
		 System.out.println(" Craete Calendar");
		Calendar cal=null;
		cal=Calendar.getInstance();
		return cal;
		
		

	}

}
