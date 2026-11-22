package com.academy.code;

public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                  
		Person set = new Person(12,"Sahwaj", "Bangalore");
		System.out.println(set.age + " , " + set.name + " , " + set.city);
		Person set1 = new Person(12);
		System.out.println(set1.age);

	}

}
//Person()
//↓
//super()
//↓
//Human()
//↓
//super()
//↓
//Object()  
//1. Person object ke liye memory allocate
//↓
//2. Person constructor call
//↓
//3. Person ke andar super() // yaha super() dekh liya to parents class ko call krega Human
//↓
//4. Human constructor call
//↓
//5. Human ke andar super()
//↓
//6. Object constructor call
//↓
//7. Object constructor complete
//↓
//8. Human constructor complete
//↓
//9. Person constructor ki remaining statements
//↓
//10. Person object ready