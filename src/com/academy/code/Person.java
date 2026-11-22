package com.academy.code;
class Human extends Object
{

	public Human() {
		super();
		System.out.println("Parents class constructor call");
	}
	
}

public class Person extends Human{
	int age ;
	String name;
	String city;
	public Person(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		System.out.println("constructor call");
	}
	public Person(int age) {
		super();
		this.age = age;
		System.out.println("Only one Argument");
	}
	
	

}
