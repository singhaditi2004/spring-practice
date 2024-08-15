package com.standalone;

import java.util.List;

public class Model {
	private List<String> names;
	@Override
	public String toString() {
		return "Model [names=" + names + "]";
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
}
