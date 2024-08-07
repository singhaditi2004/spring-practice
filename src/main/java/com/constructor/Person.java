package com.constructor;

public class Person {
	private String name;
	private int pid;
	private String city;
	private Certi certi;

	public Person(String name, int pid, String city, Certi certi) {
		this.name = name;
		this.pid = pid;
		this.city = city;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", city=" + city + "]" +"certi    "+ certi ;
	}

}
