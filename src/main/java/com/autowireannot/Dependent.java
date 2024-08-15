package com.autowireannot;

public class Dependent {
	private int ind1;
	private int ind2;
	public int getInd1() {
		return ind1;
	}
	public void setInd1(int ind1) {
		this.ind1 = ind1;
	}
	public int getInd2() {
		return ind2;
	}
	public void setInd2(int ind2) {
		this.ind2 = ind2;
	}
	@Override
	public String toString() {
		return "Dependent [ind1=" + ind1 + ", ind2=" + ind2 + "]";
	}
}
