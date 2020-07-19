package com.company.vendingMachine;

import com.company.exceptions.WrongQuestionAnsweringInput;
import com.company.products.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MachineHumanInterface {

	private static void followAnswer(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anything else? y/n");
		String answer = scanner.nextLine();
		if (answer.equalsIgnoreCase("y")) {
			getOrder();
		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("Thanks for all orders");
		}
		else {
			throw new WrongQuestionAnsweringInput();
		}

	}

	public static void getOrder(){


		ProductsMatrix productsMatrix = new ProductsMatrix();
		Map<String, List<List<Product>>> map = productsMatrix.machineFiller();

		System.out.println("What do you want?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		VMSeller productSeller = new VMSeller();

		Product product = productSeller.getProduct(input, map);

		if(product!=null) {
			System.out.println("Please take your " + product);
		}

		try {
			followAnswer();
		}
		catch (WrongQuestionAnsweringInput exception) {
			System.out.println(exception);
			followAnswer();

		}
	}


}
