package com.company.products.chocolates;

import com.company.products.Product;

public enum Chocolates implements Product {

	DERBY(250, "usual"),
	BOUNTY(300, "big"),
	TWIX(220, "usual"),
	;

	private int price;
	private String size;

	Chocolates(int price, String size) {
		this.price = price;
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
