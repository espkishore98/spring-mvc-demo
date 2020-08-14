package com.weather.domain;

public class TestModel {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public TestModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public TestModel() {
		super();
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
	


}
