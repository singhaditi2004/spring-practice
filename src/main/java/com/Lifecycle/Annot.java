package com.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annot {
	private String name;

	public Annot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Annot(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Annot [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
}
