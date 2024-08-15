package com.autowireannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Independent {
	@Autowired
	@Qualifier("depvar1")
	private Dependent depvar;

	@Override
	public String toString() {
		return "Independent [depvar=" + depvar + "]";
	}

	public Independent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dependent getDepvar() {
		return depvar;
	}

	public void setDepvar(Dependent depvar) {
		this.depvar = depvar;
		System.out.println("Set");
	}
	
	public Independent(Dependent depvar) {
		super();
		this.depvar = depvar;
		System.out.println("INside constructor of Independent");
	}

}
