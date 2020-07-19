package com.company.products.snacks;

import com.company.products.Product;

public enum Snacks implements Product {
	CHURCHXELI(800),
	BASTURMA(3000),
	SOUJUGH(4500);

	private int price;

	Snacks(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
