package com.academy.cod;

public class ElectronicProduct extends Product{
	int wart;

	public ElectronicProduct(String name, int price, String id, int wart) {
		super(name, price, id);
		this.wart = wart;
	}
	

}
