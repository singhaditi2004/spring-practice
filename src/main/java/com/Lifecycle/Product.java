package com.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean, DisposableBean {
	private int Pprice;

	public int getPprice() {
		return Pprice;
	}

	public void setPprice(int Pprice) {
		this.Pprice = Pprice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [Pprice=" + Pprice + "]";
	}

	public Product(int Pprice) {
		super();
		this.Pprice = Pprice;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("Buying product");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy
		System.out.println("Returning it");

	}
}
