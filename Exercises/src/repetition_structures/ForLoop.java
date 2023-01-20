package repetition_structures;

import java.util.Scanner;

public class ForLoop {
	public static void main (String[] args) {
		Scanner items = new Scanner(System.in);
		
		//initialize variables
		int productsTotal;
		int finalPay = 0;
		
		//Ask for the products
		System.out.println("--------How many products you've got?--------");
		productsTotal = items.nextInt();
		
		//For loop to go trough all of the shopping items
		for(int i = 1; i <= productsTotal; i++) {
			System.out.println("What´s the price of product N°" + i + "?"); //Ask for the price of current product
			int price = items.nextInt(); //User adds price of the product
			
			//Calculate the total of all products
			finalPay += price; //finalPay = finalPay + price. each loop adds the new price of the new product
			
		}
		items.close();
		
		//Print final Pay outside of loop since we only want to have this printed once at the end of the operation
		System.out.println("Your total is $" + finalPay);
	}
}
