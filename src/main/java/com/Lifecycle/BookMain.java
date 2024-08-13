package com.Lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BookMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Lifecycle/BookConfig.xml");
		context.registerShutdownHook();
//		Book book1 = (Book) context.getBean("ikagai");
//		System.out.println(book1);
	//	System.out.println("__________________________________________________________________");
//		Product prod1 = (Product) context.getBean("some");
 //       System.out.println(prod1)
          Annot anott=(Annot)context.getBean("annot");
          System.out.println(anott);
	}
}
