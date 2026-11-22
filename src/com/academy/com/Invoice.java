package com.academy.com;

public class Invoice extends Object {
	static int gst = 18;
	int amount;
	String itemName;
	String address;
	String cId;
	String cName;
	public Invoice(int amount, String itemName, String address, String cId, String cName) {
		this.amount = amount;
		this.itemName = itemName;
		this.address = address;
		this.cId = cId;
		this.cName = cName;
	}
	
	

}
