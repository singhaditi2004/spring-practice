package com.springcore.refrence;

public class first {
	private int val;
	private Second obj;
	public first() {
		super();
		// TODO Auto-generated constructor stub
	}
	public first(int val, Second obj) {
		super();
		this.val = val;
		this.obj = obj;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Second getObj() {
		return obj;
	}
	public void setObj(Second obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "first [val=" + val + ", obj=" + obj + "]";
	}
	
}
