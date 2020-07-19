package com.company.products.drinks;

import com.company.products.Product;

public enum Drinks implements Product {

	HAYCOLA(100, 1),
	ZAMZAMCOLA(80, 1),
	GARNICOLA(200, 1),
	;

	private int price;
	private int volume;

	Drinks(int price, int volume) {
		this.price = price;
		this.volume = volume;
	}

	public int getPrice() {
		return price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
