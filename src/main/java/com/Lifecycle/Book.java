package com.Lifecycle;

public class Book {
	private int price;
	private int bId;

	@Override
	public String toString() {
		return "Book [price=" + price + ", bId=" + bId + "]";
	}

	public Book(int price, int bId) {
		super();
		this.price = price;
		this.bId = bId;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public void init() {
		System.out.println("Inside init");
	}

	public void destroy() {
		System.out.println("Inside destroy");
	}
}
