package com.Lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class BookMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Lifecycle/BookConfig.xml");
		Book book1 = (Book) context.getBean("ikagai");
		System.out.println(book1);
        context.registerShutdownHook();
	}
}
