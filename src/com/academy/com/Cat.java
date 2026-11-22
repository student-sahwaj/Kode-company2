package com.academy.com;

public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog set = new Dog(12,"Pardhuman","white");
//		Dog set1 = new Dog("Pardhuman","white");
		System.out.println("Dog Behaviour: " + set.age + " , " + set.name + " , " + set.color);
		Dog set1 = new Dog("Pardhuman","white");
		System.out.println("Dog Behaviour: " + set1.name + " , " + set1.color);
		
//	new Dog()
//	    ↓
//	Dog constructor
//	    ↓
//	super()
//	    ↓
//	Animal constructor
//	    ↓
//	super()
//	    ↓
//	Object constructor
//	    ↓
//	Animal constructor complete
//	    ↓
//	Dog constructor continues
//	    ↓
//	this.dogName = dogName
//	this.age = age
//	this.breed = breed
//	    ↓
//	Dog constructor complete


	}

}
