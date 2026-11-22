package com.academy.cod;

public class User {
	String name;
	String type;
	String country;
	public User(String name, String type, String country) {
		this.name = name;
		this.type = type;
		this.country = country;
	}
	public User() {
      this("Ankit","software","India");
	}
	

}
