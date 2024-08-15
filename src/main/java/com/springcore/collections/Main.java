package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/configuration.xml");
         Collections col1=(Collections)context.getBean("rmp1");
         System.out.println(col1.getName());
         System.out.println(col1.getAddress());
         System.out.println(col1.getCustomers());
         System.out.println(col1.getStock());
         System.out.println(col1.getProp());
         System.out.println(col1.getAddress().getClass().getName());
	}
}
