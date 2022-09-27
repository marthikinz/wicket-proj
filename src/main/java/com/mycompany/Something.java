package com.mycompany;

import java.io.Serializable;

public class Something implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
