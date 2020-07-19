package com.company.vendingMachine;

import com.company.exceptions.WrongProductInputFormatException;
import com.company.products.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class VMSeller {

	private Map<String, Integer> formatInput(String input) {

		Map<String,Integer> map = new HashMap<>();
		try {
			compilePattern(map,input);
		} catch (WrongProductInputFormatException exception) {
			System.out.println(exception);
			MachineHumanInterface.getOrder();

		}
		return map;
	}

	private void compilePattern(Map<String,Integer> map, String input) {
		if (Pattern.matches("[ABC]?:[012]", input)) {
			map.put(input.split(":")[0], Integer.parseInt(input.split(":")[1]));
		} else {
			throw new WrongProductInputFormatException();
		}
	}

	public Product getProduct(String input, Map<String, List<List<Product>>> productsMatrix) {


		String key = formatInput(input).keySet().toArray()[0].toString();
		try {
			Product product = productsMatrix.get(key).get(formatInput(input).get(key)).get(0);
			productsMatrix.get(key).get(formatInput(input).get(key)).remove(0);
			return product;
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("Product is missing. Please select another one!");
		}
		return null;
	}
}
