package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainModel {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/standalone/StandAloneConfig.xml");
		Model model=(Model)context.getBean("model1");
		System.out.println(model);
		System.out.println(model.getNames().getClass().getName());
 	}
}
