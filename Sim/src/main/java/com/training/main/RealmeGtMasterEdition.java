package com.training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.training.model.Mobile;

public class RealmeGtMasterEdition {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Mobile mobile=context.getBean("mobile",Mobile.class);
		mobile.makeCall();

	}

}
