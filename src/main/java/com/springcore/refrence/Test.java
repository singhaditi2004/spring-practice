package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String []args) {
	 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/refrence/refrenceConfig.xml");
     first obj=(first) context.getBean("obFirst");
     System.out.println(obj.getVal());
 }
}
