package com.academy.com;
class Animal extends Object{

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Parents class of the Animal");
	}
	
}

public class Dog extends Animal {
//	super();
	int age;
	String name;
	String color;
	public Dog(int age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}
	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	

}

