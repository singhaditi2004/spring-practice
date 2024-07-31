package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
	private String name;
	private List<String> customers;
    private Set<String> address;
    private Map<String,Integer>stock;
    private Properties prop;
	public Collections(String name, List<String> customers, Set<String> address, Map<String, Integer> stock) {
		super();
		this.name = name;
		this.customers = customers;
		this.address = address;
		this.stock = stock;
	}
	public Collections() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCustomers() {
		return customers;
	}
	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getStock() {
		return stock;
	}
	public void setStock(Map<String, Integer> stock) {
		this.stock = stock;
	}
}
