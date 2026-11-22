package com.academy.code;
class SuperClass extends Object {

	public SuperClass() {
		super();
	}
	
	
}

public class User extends SuperClass {
	String userName;
	String userId;
	String userMobile;
	public User(String userName, String userId, String userMobile) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userMobile = userMobile;
	}
	public User(int age) {
		System.out.println("No argument of this object");
	}
	
	

}
