package com.autowireannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
           ApplicationContext context= new ClassPathXmlApplicationContext("com/autowireannot/AutoWiringconfig.xml");
	       Independent dep1=context.getBean("obj2",Independent.class);
	       System.out.println(dep1);
	
	}
}
