package com.academy.com;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice set = new Invoice(1390,"Iphone","Kodewala","cd456","Ankit");
		Invoice set1 = new Invoice(13900,"Iphone","Kodewala","cd8756","Paedhuman");
		System.out.println(" first Invoice: " + set.amount + " " + set.cId + " " + set.gst);
		System.out.println(" 2nd Invoice: " + set1.amount + " " + set1.cId + " " + set1.gst);


	}

}
