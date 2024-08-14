package com.autowiring;

public class Independent {
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
	}

	public Independent(Dependent depvar) {
		super();
		this.depvar = depvar;
	}

}
