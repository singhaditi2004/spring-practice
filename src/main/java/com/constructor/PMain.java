package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/PersonConfig.xml");
		Person p1 = (Person) context.getBean("pers1");
		System.out.println(p1);
        Addition add1=(Addition)context.getBean("add");
        add1.sum();
	}
}
