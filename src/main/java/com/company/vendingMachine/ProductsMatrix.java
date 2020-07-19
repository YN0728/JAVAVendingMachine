package com.company.vendingMachine;

import com.company.products.Product;
import com.company.products.chocolates.Chocolates;
import com.company.products.drinks.Drinks;
import com.company.products.snacks.Snacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsMatrix {

	private static final Map<String,List<List<Product>>> productsMatrix = new HashMap<>();

	static {
		List<Product> derbyShelf = new ArrayList<>();
		List<Product> bountyShelf = new ArrayList<>();
		List<Product> twixShelf = new ArrayList<>();

		List<Product> hayColaShelf = new ArrayList<>();
		List<Product> zamzamColaShelf = new ArrayList<>();
		List<Product> garniColaShelf = new ArrayList<>();

		List<Product> churchxeliShelf = new ArrayList<>();
		List<Product> basturmaShelf = new ArrayList<>();
		List<Product> soujughShelf = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			derbyShelf.add(Chocolates.DERBY);
			bountyShelf.add(Chocolates.BOUNTY);
			twixShelf.add(Chocolates.TWIX);

			hayColaShelf.add(Drinks.HAYCOLA);
			zamzamColaShelf.add(Drinks.ZAMZAMCOLA);
			garniColaShelf.add(Drinks.GARNICOLA);

			churchxeliShelf.add(Snacks.CHURCHXELI);
			basturmaShelf.add(Snacks.BASTURMA);
			soujughShelf.add(Snacks.SOUJUGH);
		}

		List<List<Product>> drinksColumn = Arrays.asList(hayColaShelf, zamzamColaShelf, garniColaShelf);
		List<List<Product>> chocolatesColumn = Arrays.asList(derbyShelf, bountyShelf, twixShelf);
		List<List<Product>> snacksColumn = Arrays.asList(churchxeliShelf, basturmaShelf, soujughShelf);

		productsMatrix.put("A", drinksColumn);
		productsMatrix.put("B", chocolatesColumn);
		productsMatrix.put("C", snacksColumn);
	}

	public Map<String, List<List<Product>>> machineFiller() {
		return productsMatrix;
	}


}
